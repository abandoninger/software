package priv.jesse.mall.service;

import priv.jesse.mall.entity.Comment;

import java.util.List;

public interface CommentService {
//    Comment findById(int id);
    List<Comment> findByProductId(int productId);

    void insertComment(String comment, Integer score, Integer productId, Integer orderId);

    List<Comment> existcomment(Integer orderId, Integer productId);
}
