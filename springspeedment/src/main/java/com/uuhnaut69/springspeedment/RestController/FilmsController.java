package com.uuhnaut69.springspeedment.RestController;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.sakila.SakilaApplication;
import com.company.sakila.sakila.sakila.actor.Actor;
import com.company.sakila.sakila.sakila.actor.ActorManager;
import com.company.sakila.sakila.sakila.film.Film;
import com.company.sakila.sakila.sakila.film.FilmManager;
import com.company.sakila.sakila.sakila.film.generated.GeneratedFilm;
import com.company.sakila.sakila.sakila.film_actor.FilmActor;
import com.company.sakila.sakila.sakila.film_actor.FilmActorManager;
//import com.speedment.common.logger.Logger;
//import com.speedment.common.logger.LoggerFactory;

@RestController
@RequestMapping("/film")
public class FilmsController {
//	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	private final FilmActorManager filmActors;
	private final ActorManager actors;
	private final FilmManager films;

	public FilmsController(SakilaApplication app) {
		films = app.getOrThrow(FilmManager.class);
		filmActors = app.getOrThrow(FilmActorManager.class);
		actors = app.getOrThrow(ActorManager.class);
	}

	@GetMapping("/")
	List<Film> getFilms() {
		return films.stream().collect(Collectors.toList());
	}

	@GetMapping("/{id}")
	Film getFilmById(@PathVariable int id) {
		return films.stream().filter(Film.FILM_ID.equal(id)).findAny().orElse(null);
	}

	@GetMapping("/byactor/{actorName}")
	List<Film> getFilmByActor(@PathVariable String actorName) {
		Integer actorId = actors.stream().filter(Actor.LAST_NAME.equalIgnoreCase(actorName)).mapToInt(Actor.ACTOR_ID)
				.boxed().findAny().orElse(null);

		return actorId == null ? null
				: filmActors.stream().filter(FilmActor.ACTOR_ID.equal(actorId)).map(films.finderBy(FilmActor.FILM_ID))
						.collect(Collectors.toList());
	}

//	@GetMapping("byactors/{actorName}")
//	Map<String, List<String>> getFilmByActors(@PathVariable String actorName) {
//		Set<Integer> actorIds = actors.stream()
//				.filter(Actor.LAST_NAME.containsIgnoreCase(actorName)
//						.or(Actor.FIRST_NAME.containsIgnoreCase(actorName)))
//				.mapToInt(Actor.ACTOR_ID).distinct().boxed().collect(Collectors.toSet());
//
//		return actorIds.isEmpty() ? Collections.EMPTY_MAP
//				: filmActors.stream().filter(FilmActor.ACTOR_ID.in(actorIds))
//						.collect(groupingBy(
//								actors.finderBy(FilmActor.ACTOR_ID)
//										.andThen(a -> a.getFirstName() + " " + a.getLastName()),
//								mapping(films.finderBy(FilmActor.FILM_ID).andThen(GeneratedFilm::getTitle),toList())));
//	}
}