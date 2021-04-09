package com.david.Lookify.services;

import java.util.ArrayList;



import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import javax.persistence.Table;
import org.springframework.stereotype.Service;
import com.david.Lookify.models.Song;
import com.david.Lookify.repositories.SongRepository;

@Service
public class SongService {
	private final SongRepository songRepository;
	
	public SongService(SongRepository songRepository) {
		this.songRepository = songRepository;
	}
	public List<Song> findByArtist(String Artist) {
		return this.songRepository.findByArtistContaining(Artist);
//		return this.songRepository.findByArtistContaining(Artist).orElse(null);
	}
//	public Song searchByArtist(String Artist ) {
//		return this.songRepository.findByArtistContaining(Artist);
//	}
	public Song createNewSong(String Name, String Artist, int Rating) {
		Song newSong = new Song(Name, Artist, Rating);
		return this.songRepository.save(newSong);
	}
	public List<Song> allSongs(){
	return this.songRepository.findAll();
	}
	public List<Song> topTen() {
		return songRepository.findTop10ByOrderByRatingDesc();
	}
//	public Song findSong(String Artist) {
//		List<Song> optionalSong = songRepository.findByArtistContaining(Artist);
//		if(optionalSong.isPresent()) {
//			return optionalSong.get();
//		} else {
//			return null;
//			
//		}
	}
	
	


