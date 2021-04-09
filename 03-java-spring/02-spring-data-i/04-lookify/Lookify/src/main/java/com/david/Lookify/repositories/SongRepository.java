package com.david.Lookify.repositories;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.david.Lookify.models.Song;


@Repository
public interface SongRepository extends CrudRepository<Song, String> {
	
	List<Song> findAll();
	
	List<Song> findByArtistContaining(String Artist);
	
	List<Song> findByArtist(String search);
	
	List<Song> findTop10ByOrderByRatingDesc();
}
