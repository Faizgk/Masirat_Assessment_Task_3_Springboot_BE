package com.blog.blogPosts;

import java.util.Arrays;
import java.util.List;

public class BlogsRepo {
    static List<BlogModel> DB = Arrays.asList(
            new BlogModel(1L,"Blog-1",  "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris"),
            new BlogModel(2L,"Blog-2", "Dolor sit amet lorem ipsum, consectetur adipiscing elit. Quisque sit amet lacus vitae sapien dignissim tincidunt. Integer nec odio euismod, aliquam erat eu, sollicitudin nulla"),
            new BlogModel(3L,"Blog-3", "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum"),
            new BlogModel(4L,"Blog-4", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."),
            new BlogModel(5L,"Blog-5", "Pellentesque in ipsum id orci porta dapibus. Vivamus suscipit tortor eget felis porttitor volutpat. Donec sollicitudin molestie malesuada"),
            new BlogModel(6L,"Blog-6","Nulla quis lorem ut libero malesuada feugiat. Donec rutrum congue leo eget malesuada. Curabitur aliquet quam id dui posuere blandit")
            );

}
