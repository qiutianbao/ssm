package com.question.dao.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;

import com.question.dao.QuestionDao;
import com.question.entity.PageTool;
import com.question.entity.Questions;
/**
 * 问题数据访问实现类
 * @author Administrator
 *
 */
public class QuestionDaoImpl implements QuestionDao {
    private SqlSessionTemplate sqlSessionTemplate;

    /**
     * 查询所有问题并按最后修改时间倒序排序
     * @return
     */
    public List<Questions> findAllQuestion(final PageTool pageTool) {
        return sqlSessionTemplate.selectList("com.question.dao.QuestionDao.findAllQuestion",pageTool);
    }
    /**
     * 保存新问题
     *
     * @return
     */
    public int saveNewQuestion(Questions questions) {
        return sqlSessionTemplate.insert("com.question.dao.QuestionDao.saveNewQuestion",questions);
    }
    /**
     * 查询制定问题的所有答案信息
     *
     * @return
     */
    public Questions queryQuestionById(Long id) {
        return sqlSessionTemplate.selectOne("com.question.dao.QuestionDao.queryQuestionById",id);
        //return sqlSessionTemplate.getMapper(QuestionDao.class).findBySN(id);;
    }
    /**
     * 总记录数
     *  @return
     */
    public int findTotalCount() {
        return sqlSessionTemplate.selectOne("com.question.dao.QuestionDao.findTotalCount");
    }
    /**
     * 修改制定问题的回答次数和最后修改时间
     *
     * @return
     */
    public int updateQuestion(Questions questions) {
        int result=0;
        try {
            sqlSessionTemplate.update("com.question.dao.QuestionDao.updateQuestion", questions);
            result=1;
        } catch (Exception e) {
            e.printStackTrace();
            result=-1;
        }
        return result;
    }
    /**
     * 删除问题
     *
     * @return
     */
    public int deleteQuestions(Questions questions) {
        int result=0;
        try {
            sqlSessionTemplate.delete("com.question.dao.QuestionDao.deleteQuestions", questions);
            result=1;
        } catch (Exception e) {
            e.printStackTrace();
            result=-1;
        }
        return result;
    }
    public SqlSessionTemplate getSqlSessionTemplate() {
        return sqlSessionTemplate;
    }
    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

}
