# Project 3 - *Parstagram*

**Parstagram** is a photo sharing app using Parse as its backend.

Time spent: **6** hours spent in total

## User Stories

The following **required** functionality is completed:

- [X] User sees app icon in home screen.
- ![icon](https://user-images.githubusercontent.com/56266109/174356956-44242eab-4fcd-49cd-9a58-27f56d908e40.gif)
- [X] User can sign up to create a new account using Parse authentication
-![signUp](https://user-images.githubusercontent.com/56266109/174357098-eccced6e-926b-4dfc-9544-86bcf012c176.gif)
- [X] User can log in to their account
- ![login](https://user-images.githubusercontent.com/56266109/174357231-8e1c6a94-16b8-4280-9eb0-a0ed8c177e03.gif)
- [X] The current signed in user is persisted across app restarts
- ![persistance](https://user-images.githubusercontent.com/56266109/174357372-c292839d-3543-47fd-a594-afaf8c829cfd.gif)
- [X] User can log out of!
- [logout](https://user-images.githubusercontent.com/56266109/174357467-1bd65900-79e1-4b87-bf2f-1047365ba857.gif)
 their account
- [X] User can take a photo, add a caption, and post it to "Instagram"
- ![post](https://user-images.githubusercontent.com/56266109/174357652-487d38df-7e99-46a2-be69-5dee8584bdbd.gif)
- [X] User can view the last 20 posts submitted to "Instagram"
- ![feed](https://user-images.githubusercontent.com/56266109/174358001-86b03061-d3c3-42aa-9454-bbc778608b1b.gif)
- [X] User can pull to refresh the last 20 posts submitted to "Instagram"
- ![refresh](https://user-images.githubusercontent.com/56266109/174358333-ca181893-6206-4f2a-8164-f00e2c4d6087.gif)
- [X] User can tap a post to go to a Post Details activity and caption.
![details](https://user-images.githubusercontent.com/56266109/174358431-d659eda2-0bf5-4ae3-adee-b231d136fb11.gif)

The following **stretch** features are implemented:

- [X] Add a timestamp to the Post Details activity.
- <img width="454" alt="Screen Shot 2022-06-17 at 11 40 22 AM" src="https://user-images.githubusercontent.com/56266109/174358569-a1076764-3c64-4c4b-9a9e-988e44e23569.png">
- [ ] Style the login page to look like the real Instagram login page.
- [X] Style the feed to look like the real Instagram feed.
- <img width="473" alt="Screen Shot 2022-06-17 at 11 40 57 AM" src="https://user-images.githubusercontent.com/56266109/174358660-d1a31712-3eb4-475b-b410-ef0308db48ea.png">
- [ ] User can load more posts once they reach the bottom of the feed using endless scrolling.
- [X] User should switch between different tabs using fragments and a Bottom Navigation View.
  - [X] Feed Tab (to view all posts from all users)
  - [X] Capture Tab (to make a new post using the Camera and Photo Gallery)
  - [X] Profile Tab (to view only the current user's posts)
  - ![bottomNavigation](https://user-images.githubusercontent.com/56266109/174358941-52fa3ea9-514e-4404-9159-57643596b41d.gif)
- [X] Show the username and creation time for each post
- <img width="474" alt="Screen Shot 2022-06-17 at 11 42 28 AM" src="https://user-images.githubusercontent.com/56266109/174359707-d6f6c3a9-b5fb-4d2c-9508-107e64d5432d.png">

- User Profiles:
  - [X] Allow the logged in
  - ![takeProfilePic](https://user-images.githubusercontent.com/56266109/174361946-365bf68d-6875-44df-84b8-932255001e4f.gif)
 user to add a profile photo
  - [X] Display the profile photo with each post
  - <img width="453" alt="Screen Shot 2022-06-17 at 11 43 59 AM" src="https://user-images.githubusercontent.com/56266109/174363125-2b96db43-66ba-486c-9e2b-ed111262edb8.png">
  - [ ] Tapping on a post's username or profile photo goes to that user's profile page
  - [ ] User Profile shows posts in a grid
- [ ] After the user submits a new post, show an indeterminate progress bar while the post is being uploaded to Parse
- [ ] User can comment on a post and see all comments for each post in the post details screen.
- [ ] User can like a post and see number of likes for each post in the post details screen.

The following **additional** features are implemented:
- [X] Verificate if the photo is empty or was not correctly taken and inform the user through a toast
- [X] Verificate if the caption is empty and inform the user through a toast
- [X] Verificate if the username/password is when signing in and inform the user through a toast
- [X] Display profile picture and username on the profile tab

Please list two areas of the assignment you'd like to **discuss further with your peers** during the next class (examples include better ways to implement something, how to extend your app in certain ways, etc):

1. How to implement a grid recycler view
2. How to create a way that a user can only like the photo once

## Video Walkthrough

Here's a walkthrough of implemented user stories:

<img src='http://i.imgur.com/link/to/your/gif/file.gif' title='Video Walkthrough' width='' alt='Video Walkthrough' />
![complete](https://user-images.githubusercontent.com/56266109/174356822-25aeac56-5ea2-49ee-8a88-e1f58666f2ea.gif)


GIF created with [Kap](https://getkap.co/).

## Credits

List an 3rd party libraries, icons, graphics, or other assets you used in your app.

- [Android Async Http Client](http://loopj.com/android-async-http/) - networking library


## Notes

Describe any challenges encountered while building the app.

## License

    Copyright 2022 Daniela Esparza Espinosa

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
