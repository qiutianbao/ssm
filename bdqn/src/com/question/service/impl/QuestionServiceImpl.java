package com.question.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.question.dao.QuestionDao;
import com.question.entity.PageTool;
import com.question.entity.Questions;
import com.question.service.QuestionService;
/**
 * 问题业务实现类
 * @author Administrator
 *
 */
public class QuestionServiceImpl implements QuestionService {

    //问题数据访问对象
    //@Autowired
    private QuestionDao questionDao;
    /**
     * 查询所有问题并按最后修改时间倒序排序
     * @return
     */
    public List<Questions> findAllQuestion(final PageTool pageTool) {
        return questionDao.findAllQuestion(pageTool);
    }

    public QuestionDao getQuestionDao() {
        return questionDao;
    }

    public void setQuestionDao(QuestionDao questionDao) {
        this.questionDao = questionDao;
    }
    /**
     * 保存新问题
     *
     * @return
     */
    public int saveNewQuestion(Questions questions) {
        return questionDao.saveNewQuestion(questions);
    }
    /**
     * 查询制定问题的所有答案信息
     *
     * @return
     */
    public Questions queryQuestionById(Long id) {
        return questionDao.queryQuestionById(id);
    }
    /**
     * 总记录数
     *  @return
     */
    public int findTotalCount() {
        return questionDao.findTotalCount();
    }
    /**
     * 修改制定问题的回答次数和最后修改时间
     *
     * @return
     */
    public int updateQuestion(Questions questions) {
        return questionDao.updateQuestion(questions);
    }
    /**
     * 删除问题
     *
     * @return
     */
    public int deleteQuestions(Questions questions) {
        return questionDao.deleteQuestions(questions);
    }

}
