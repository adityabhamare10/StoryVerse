package com.aditya.storyverse.Model;

public class StoryModel {

    int story, storyType, profilePic;
    String nameOfUser;

    public StoryModel(int story, int storyType, int profilePic, String nameOfUser) {
        this.story = story;
        this.storyType = storyType;
        this.profilePic = profilePic;
        this.nameOfUser = nameOfUser;
    }

    public int getStory() {
        return story;
    }

    public void setStory(int story) {
        this.story = story;
    }

    public int getStoryType() {
        return storyType;
    }

    public void setStoryType(int storyType) {
        this.storyType = storyType;
    }

    public int getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(int profilePic) {
        this.profilePic = profilePic;
    }

    public String getNameOfUser() {
        return nameOfUser;
    }

    public void setNameOfUser(String nameOfUser) {
        this.nameOfUser = nameOfUser;
    }
}
