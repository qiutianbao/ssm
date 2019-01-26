package com.question.service;

import java.util.List;

import com.question.entity.PageTool;
import com.question.entity.Questions;
/**
 * 问题业务接口
 * @author Administrator
 *
 */
public interface QuestionService {

    /**
     * 查询所有问题并按最后修改时间倒序排序
     * @return
     */
    List<Questions> findAllQuestion(final PageTool pageTool);
    /**
     * 保存新问题
     *
     * @return
     */
    int saveNewQuestion(Questions questions);
    /**
     * 查询制定问题的所有答案信息
     *
     * @return
     */
    Questions queryQuestionById(Long id);
    /**
     * 总记录数
     * @return
     */
    int findTotalCount();
    /**
     * 修改制定问题的回答次数和最后修改时间
     *
     * @return
     */
    int updateQuestion(Questions questions);
    /**
     * 删除问题
     *
     * @return
     */
    int deleteQuestions(Questions questions);

}
