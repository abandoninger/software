package priv.jesse.mall.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import priv.jesse.mall.entity.Comment;
import priv.jesse.mall.entity.User;

import java.util.List;


public interface CommentDao extends JpaRepository<Comment, Integer> {
    List<Comment> findByProductId(int productId);


    List<Comment> findByProductIdAndOrderId(Integer productId, Integer orderId);
}
