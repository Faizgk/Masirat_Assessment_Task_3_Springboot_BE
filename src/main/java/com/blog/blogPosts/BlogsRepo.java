package com.blog.blogPosts;

import java.util.Arrays;
import java.util.List;

public class BlogsRepo {
    static List<BlogModel> DB = Arrays.asList(
            new BlogModel(1L,"Blog-1", "https://images.unsplash.com/photo-1499750310107-5fef28a66643?w=500", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris"),
            new BlogModel(2L,"Blog-2", "https://images.unsplash.com/photo-1501504905252-473c47e087f8?w=500","Dolor sit amet lorem ipsum, consectetur adipiscing elit. Quisque sit amet lacus vitae sapien dignissim tincidunt. Integer nec odio euismod, aliquam erat eu, sollicitudin nulla"),
            new BlogModel(3L,"Blog-3", "https://images.unsplash.com/photo-1488190211105-8b0e65b80b4e?w=500", "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum"),
            new BlogModel(4L,"Blog-4", "https://images.unsplash.com/photo-1505330622279-bf7d7fc918f4?w=500", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."),
            new BlogModel(5L,"Blog-5", "https://images.unsplash.com/photo-1519389950473-47ba0277781c?w=500", "Pellentesque in ipsum id orci porta dapibus. Vivamus suscipit tortor eget felis porttitor volutpat. Donec sollicitudin molestie malesuada"),
            new BlogModel(6L,"Blog-6", "https://images.unsplash.com/photo-1471107340929-a87cd0f5b5f3?w=500","Nulla quis lorem ut libero malesuada feugiat. Donec rutrum congue leo eget malesuada. Curabitur aliquet quam id dui posuere blandit")
            );

}
