package com.fitkitapp.server.util.converters;

import com.fasterxml.jackson.databind.util.StdConverter;
import com.fitkitapp.server.models.Post;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Boris on 06.08.2017.
 */
public class ListPostsConverter extends StdConverter<List<Post>, List<Long>> {
    @Override
    public List<Long> convert(List<Post> posts) {
        return posts.stream().map(Post::getId).collect(Collectors.toList());
    }
}
