package com.andbase.model;

import com.ab.db.orm.annotation.Column;
import com.ab.db.orm.annotation.Id;
import com.ab.db.orm.annotation.Table;
@Table(name = "user")
public class User {

	// ID @Id����,int����,���ݿ⽨��ʱ���ֶλ���Ϊ������
	@Id
	@Column(name = "_id")
	private int _id;
	
	@Column(name = "u_id")
	private String uId;

	// ��¼�û��� length=20�����ֶεĳ�����20
	@Column(name = "name", length = 20)
	private String name;

	// �û�����
	@Column(name = "password")
	private String password;

	// �ǳ�
	@Column(name = "nick_name")
	public String nickName;

	// ����һ������ֵ,��type = "INTEGER"�淶һ��.
	@Column(name = "age", type = "INTEGER")
	private int age;

	// �û��Ա�
	@Column(name = "sex")
	public String sex;

	// �û�����
	// ��������ʼʱû�д�����,���򿪷��в��뵽������,Ҳ����ж�س���.
	@Column(name = "email")
	private String email;

	// ͷ���ַ
	@Column(name = "photo_url")
	private String photoUrl;

	// ����ʱ��
	@Column(name = "create_time")
	private String createTime;

	// ����
	@Column(name = "city")
	private String city;

	// ���
	@Column(name = "intro")
	private String intro;

	// ����
	@Column(name = "point")
	private int point;

	// �û�Ȩ��,0��ʾ����Ա��1��ʾ��Ա
	@Column(name = "rights")
	public int rights;

	// �û�����
	@Column(name = "question")
	public String question;

	// �û���
	@Column(name = "answer")
	public String answer;
	
	// ��¼����
	@Column(name = "login_count")
	public int loginCount;
	
	// ��Щ�ֶ������ܲ�ϣ�����浽���ݿ���,����@Columnע�;Ͳ���ӳ�䵽���ݿ�.
	private String remark;
	
	// ��¼��Ȩ
	@Column(name = "access_token")
	private String accessToken;
	
	// �Ƿ�Ϊ��ǰ��¼
	@Column(name = "is_login_user")
	private boolean isLoginUser;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public int getRights() {
		return rights;
	}

	public void setRights(int rights) {
		this.rights = rights;
	}

	public String getPhotoUrl() {
		return photoUrl;
	}

	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getIntro() {
		return intro;
	}

	public void setIntro(String intro) {
		this.intro = intro;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public int getLoginCount() {
		return loginCount;
	}

	public void setLoginCount(int loginCount) {
		this.loginCount = loginCount;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public int get_id() {
		return _id;
	}

	public void set_id(int _id) {
		this._id = _id;
	}

	public void setuId(String uId) {
		this.uId = uId;
	}

	public String getuId() {
		return uId;
	}

	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public boolean isLoginUser() {
		return isLoginUser;
	}

	public void setLoginUser(boolean isLoginUser) {
		this.isLoginUser = isLoginUser;
	}

}