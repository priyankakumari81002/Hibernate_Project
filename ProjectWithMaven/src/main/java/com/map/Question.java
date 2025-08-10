package com.map;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Question 
{
 @Id
 @Column(name="question_id")
 private int QuestionId;
 private String question;
@OneToMany(mappedBy = "question")
 private List<Answer> answers;
 //private Answer answer;
public int getQuestionId() {
	return QuestionId;
}
public void setQuestionId(int questionId) {
	QuestionId = questionId;
}
public String getQuestion() {
	return question;
}
public void setQuestion(String question) {
	this.question = question;
}

public List<Answer> getAnswers() {
	return answers;
}
public void setAnswers(List<Answer> answers) {
	this.answers = answers;
}

public Question(int questionId, String question, List<Answer> answers) {
	super();
	QuestionId = questionId;
	this.question = question;
	this.answers = answers;
}
public Question() {
	super();
	// TODO Auto-generated constructor stub
} 
 
}
