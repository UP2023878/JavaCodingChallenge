package com.google;

public class VideoPlayer {

  private final VideoLibrary videoLibrary;

  public VideoPlayer() {
    this.videoLibrary = new VideoLibrary();
  }

  public void numberOfVideos() {
    System.out.printf("%s videos in the library%n", videoLibrary.getVideos().size());
  }

  public void showAllVideos() { System.out.println("Here's a list off all available videos:");
  System.out.println(videoLibrary.getVideo("amazing_cats_video_id").getTitle() + " (" +
          videoLibrary.getVideo("amazing_cats_video_id").getVideoId() + ") " +
          videoLibrary.getVideo("amazing_cats_video_id").getTags());
  System.out.println(videoLibrary.getVideo("another_cat_video_id").getTitle() + " (" +
          videoLibrary.getVideo("another_cat_video_id").getVideoId() + ") " +
          videoLibrary.getVideo("another_cat_video_id").getTags());
  System.out.println(videoLibrary.getVideo("funny_dogs_video_id").getTitle() + " (" +
            videoLibrary.getVideo("funny_dogs_video_id").getVideoId() + ") " +
            videoLibrary.getVideo("funny_dogs_video_id").getTags());
  System.out.println(videoLibrary.getVideo("life_at_google_video_id").getTitle() + " (" +
            videoLibrary.getVideo("life_at_google_video_id").getVideoId() + ") " +
            videoLibrary.getVideo("life_at_google_video_id").getTags());
  System.out.println(videoLibrary.getVideo("nothing_video_id").getTitle() + " (" +
            videoLibrary.getVideo("nothing_video_id").getVideoId() + ") " +
            videoLibrary.getVideo("nothing_video_id").getTags());
  }

  String lastVideoId = "";
  public void playVideo(String videoId) {
    lastVideoId = videoLibrary.getVideo(videoId).getTitle();
    System.out.printf("Playing video: %s\n", lastVideoId);

  }

  public void stopVideo() {
    if(lastVideoId.equals("")){
      System.out.println("Cannot play video: Video does not exist");
    }
    else{
      System.out.printf("Stopping video: %s\n", lastVideoId);
      lastVideoId = "";
    }
  }

  public void playRandomVideo() {
    System.out.println("playRandomVideo needs implementation");
  }

  String pausedVideo = "";
  public void pauseVideo() {
    if(lastVideoId.equals("")){
      System.out.println("Cannot pause video: No video is currently playing");
    }
    else{
      System.out.printf("Pausing video: %s\n", lastVideoId);
      lastVideoId = pausedVideo;
    }
  }

  String continueVideo = "";
  public void continueVideo() {
    if(pausedVideo.equals("")){
      System.out.println("Cannot continue video: Video is not paused");
    }
    else{
      System.out.printf("Continuing video: %s\n", pausedVideo);
      pausedVideo = continueVideo;
    }
  }


  public void showPlaying() {
    System.out.printf("Currently playing: %s", lastVideoId = videoLibrary.getVideo(pausedVideo).getTitle() +" (",
            lastVideoId = videoLibrary.getVideo(pausedVideo).getVideoId() + ") ");
  }

  String playlistNames = "";
  public void createPlaylist(String playlistName) {
    System.out.printf("Successfully created new playlist: %s\n", playlistName);
    playlistName = playlistNames;

  }

  public void addVideoToPlaylist(String playlistName, String videoId) {
    System.out.println("addVideoToPlaylist needs implementation");
  }

  public void showAllPlaylists() {
    System.out.printf("Showing all playlists:\n\t%s", playlistNames);
  }

  public void showPlaylist(String playlistName) {
    System.out.println("showPlaylist needs implementation");
  }

  public void removeFromPlaylist(String playlistName, String videoId) {
    System.out.println("removeFromPlaylist needs implementation");
  }

  public void clearPlaylist(String playlistName) {
    System.out.println("clearPlaylist needs implementation");
  }

  public void deletePlaylist(String playlistName) {
    System.out.println("deletePlaylist needs implementation");
  }

  public void searchVideos(String searchTerm) {
    System.out.println("searchVideos needs implementation");
  }

  public void searchVideosWithTag(String videoTag) {
    System.out.println("searchVideosWithTag needs implementation");
  }

  public void flagVideo(String videoId) {
    System.out.println("flagVideo needs implementation");
  }

  public void flagVideo(String videoId, String reason) {
    System.out.println("flagVideo needs implementation");
  }

  public void allowVideo(String videoId) {
    System.out.println("allowVideo needs implementation");
  }
}
