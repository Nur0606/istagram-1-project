package peaksoft.repositori;

import peaksoft.entity.Post;

import java.util.List;

public interface PostRepo {
    List<Post> findAll();
    void save(Post like);
    Post findById(Long Id);
    void deleteById(Long Id);
    void updateById(Long Id,Post newEntity);
}
