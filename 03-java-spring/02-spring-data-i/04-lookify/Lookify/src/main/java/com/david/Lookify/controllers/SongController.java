package com.david.Lookify.controllers;

import java.util.ArrayList;


import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.david.Lookify.models.Song;
import com.david.Lookify.services.SongService;

public class SongController {

	private SongService songService;
	public SongController(SongService songService) {
		this.songService = songService;
	}
	
	@GetMapping("/")
	public String index(Model model) {
		return "index.jsp";
	}
	
	@GetMapping("/dashboard")
	public String dashboard(Model model) {
		List<Song> songs = songService.allSongs();
		model.addAttribute("songs", songs);
		return "dashboard.jsp";
	}
	
	@GetMapping("/search/{artist}")
	public String artistSearch(@PathVariable("artist") String artist, Model viewModel) {
		viewModel.addAttribute("song", this.songService.findByArtist(artist));
		return "searchArtist.jsp";
		}
	
	@GetMapping("/songs/new")
	public String add(Model model) {
		return "new.jsp";
	}
	@PostMapping("/songs/new")
	public String newSong(@RequestParam("name") String name, @RequestParam("artist") String artist, @RequestParam("rating") int rating, RedirectAttributes redirectAttr) {
		ArrayList<String> errors = new ArrayList<String>();
		if(name.equals("")) {
			errors.add("Oops! You forgot the name of this song!");
		}
		if(errors.size() > 0) {
			for(String e: errors) {
			redirectAttr.addFlashAttribute("errors", e);
			}
			return "redirect:/songs/new";
		}
		if(artist.equals("")) {
			errors.add("Oops! You forgot the name of the Artist!");
		}
		if(errors.size() > 0) {
			for(String e: errors) {
			redirectAttr.addFlashAttribute("errors", e);
			}
			return "redirect:/songs/new";
		}
		this.songService.createNewSong(name, artist, rating);
		return "redirect:/dashboard";
	}
	@GetMapping("/songs/{id}")
	public String details(Model model) {
		return "song.jsp";
	}
	@RequestMapping("/search/topTen")
	public String TopTen(Model model) {
		model.addAttribute("songs", songService.topTen());
		return "/songs/topTen";
	}
}

