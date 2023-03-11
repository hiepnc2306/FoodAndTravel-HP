package com.example.detaithuctap.Service.DuLichService.commentServiceImpl;

import com.example.detaithuctap.Entity.DuLich.commentaAddress;
import com.example.detaithuctap.Repository.DuLichRepository.CommentReponsImpl;
import com.example.detaithuctap.Service.DuLichService.commentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional
public class commentServiceImpl implements commentService {
    @Autowired
    private CommentReponsImpl reponsitory;
    @Override
    public List<commentaAddress> loadByIdAddress(int idAddress) {
        return reponsitory.findByIdAddress(idAddress);
    }

    @Override
    public void saveComment(commentaAddress commentaAddress) {
        reponsitory.saveOrUpdate(commentaAddress);
    }

    @Override
    public void updateComment(commentaAddress commentaAddress) {
        reponsitory.saveOrUpdate(commentaAddress);
    }

    @Override
    public void delComment(int id) {
        reponsitory.delete(id);
    }
}