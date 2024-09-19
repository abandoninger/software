package priv.jesse.mall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import priv.jesse.mall.dao.CommentDao;
import priv.jesse.mall.entity.Comment;
import priv.jesse.mall.service.CommentService;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    CommentDao commentDao;

    @Override
    public List<Comment> findByProductId(int productId) {
        return commentDao.findByProductId(productId);
    }

    @Override
    public void insertComment(String comment, Integer score, Integer productId, Integer orderId) {
        Comment comments=new Comment();
        comments.setContent(comment);
        comments.setOrderId(orderId);
        comments.setProductId(productId);
        commentDao.save(comments);
    }

    @Override
    public List<Comment> existcomment(Integer orderId, Integer productId) {
        return commentDao.findByProductIdAndOrderId(productId,orderId);
    }
//    @Override
//    public Comment findById(int id) {
//        return null;
//    }
}
