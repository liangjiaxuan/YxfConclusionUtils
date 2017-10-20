package com.rongwei.yxfconclusionutils.http;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/2/21.
 */

public class LYBean {

    /**
     * {"errorMsg":null,"code":200,"data":"","success":true}    {"errorMsg":null,"code":200,"data":0,"success":true}
     */
    public static class LYBase {
        public String msg;
        public int code;
        public String success;
        public Object data;
        public String errorMsg;
    }

    /**
     * 手机号码登录
     */
    public static class ReqLoginUser {
        public String userAccount = "";//手机号码
        public String captcha = "";//手机号码
        public int deviceType = 0;//设备类型(0安卓1苹果)
        public String deviceToken = "";//设备令牌
        public String userLongitude = "";//经度
        public String userLatitude = "";//纬度
    }

    /**
     * 第三方登录
     */
    public static class ReqLoginUm {
        public String userAccount = "";//友盟帐号
        public int deviceType = 0;//设备类型(0安卓1苹果)
        public String deviceToken = "";//设备令牌
        public String userLongitude = "";//经度
        public String userLatitude = "";//纬度
    }

    /**
     * 缓存登录
     */
    public static class ReqLoginCache {
        public int userId;//用户主键id
        public String userCaptcha = "";//用户码
        public int deviceType = 0;//设备类型(0安卓1苹果)
        public String deviceToken = "";//设备令牌
        public float userLongitude;//经度
        public float userLatitude;//纬度

    }

    /**
     * 手机号码登录
     * 第三方登录
     * 缓存登录
     */
    public static class RspLoginData {
        public int userId;//用户主键id
        public String userCaptcha = "";//用户码
        public int deviceType;//设备类型(0安卓1苹果)
        public String deviceToken = "";//设备令牌
        public float userLongitude;//经度
        public float userLatitude;//纬度
        public long createTime;//创建时间
        public long loginTime;//登录时间
        public int isVip;//是否是会员
        public long vipTime;//会员到期时间
        public int isLock;//帐号是否锁定
        public int isTest;//是否是测试帐号
        public int isThird;//是否是第三方登录
        public String userAccount = "";//帐号对应手机号或uid


    }

    /**
     * 退出登录
     */
    public static class ReqLogout {
        public int userId;//用户主键id
    }

    /**
     * 退出登录
     */
    public static class RspLogout {

    }

    /**
     * 获取验证码
     */
    public static class ReqGetVerifyCode {
        public String userAccount;
    }

    /**
     * 获取验证码
     */
    public static class RspGetVerifyCode {

    }

    /**
     * 检查个人资料完善
     */
    public static class ReqCheckUserInfo {
        public int userId;//用户主键id
    }

    /**
     * 检查个人资料完善
     */
    public static class RspCheckUserInfo {
        public String userNickname;//用户昵称
    }

    /**
     * 获取省份信息
     * 无参数将返回所有省份
     */
    public static class ReqGetProvince {
        public int provinceId;
    }

    /**
     * 获取省份信息
     */
    public static class RspGetProvince {
        public int provinceId;
        public String provinceName = "";
        public int parentId;
    }

    /**
     * 获取城市信息
     * 无参数将返回所有城市
     */
    public static class ReqGetCity {
        public int cityId;
    }

    /**
     * 获取城市信息
     */
    public static class RspGetCity {
        public int cityId;
        public String cityName = "";
        public int parentId;
    }

    /**
     * 获取区域信息
     * 无参数将返回所有区域
     */
    public static class ReqGetDistrict {
        public int districtId;
    }

    /**
     * 获取区域信息
     */
    public static class RspGetDistrict {
        public int districtId;
        public String districtName = "";
        public int parentId;
    }

    /**
     * 更新用户初始化信息
     */
    public static class ReqAddUserInit {
        public int userId;//用户id
        public String userIcon;//用户头像地址
        public String userNickname;//用户昵称
        public int userSex;//用户性别
        public int userAge;//用户年龄
        public int userProvince;//用户省份
        public int userCity;//用户城市
        public int userDistrict;//用户区域

    }

    /**
     * 更新用户初始化信息
     */
    public static class RspAddUserInit {

    }

    /**
     * 修改用户资料
     * 多功能接口传入用户主键id以及所要修改的用户信息即可修改小部分用户信息
     */
    public static class ReqUpdatePersonalInfo {
        public String userId;//该用户主键id
        public String userIcon;//用户头像
        public String userSignature;//用户个人说明
        public String userNickname;//用户昵称
        public String userSex;//用户性别
        public String userAge;//用户年龄
        public String userProvince;//用户省份
        public String userCity;//用户城市
        public String userDistrict;//用户区域
        public String userWeight;//用户体重
        public String userHeight;//用户身高
        public String userConstellation;//星座
        public String userQualification;//学历
        public String userProfession;//行业
        public String userIncome;//收入
        public String userGoodAt;//擅长
        public String userWantDo;//最近想做的事
        public String userOpinionLove;//对爱情的看法
        public String userOpinionHalf;//对另一半的看法
        public String userOpinionSex;//对性的看法

    }

    /**
     * 修改用户资料
     */
    public static class RspUpdatePersonalInfo {

    }

    /**
     * 获取约会类型列表
     * 无参数将返回所有约会类型
     */
    public static class ReqGetDateType {
        public int dateTypeId;//约会类型对应id(Integer)
    }

    /**
     * 获取约会类型列表
     */
    public static class RspGetDateType {
        public int dateTypeId;//约会类型对应id(Integer)
        public String dateTypeName = "";//约会类型名字
        public String dateTypeIcon = "";//约会类型图标

    }

    /**
     * 获取约会内容
     * 多功能接口,根据传入的参数返回不同的筛选结果
     */
    public static class ReqGetDate {
        public int pageNum;//分页信息(Integer) 从1开始
        public int userId;//查看的用户主键id(Integer)
        public int dateTypeId;//约会类型对应id(Integer) 0表示所有
        public String createTime = "";//第一条约会信息创建时间
        public int arrayType;//筛选排序类型(1最新2近期3附近)(Integer) 为3附近时 传递经纬度 不传递城市
        public int userSex;//用户性别(0男1女2不限)(Integer)
        public int provinceId;//省份对应id(Integer)
        public int cityId;//城市对应id(Integer)
        public int districtId;//区域对应id(Integer)
        public Double dateLongitude;//用户定位经度(Double)
        public Double dateLatitude;//用户定位纬度(Double)

    }

    /**
     * 获取约会内容
     */
    public static class RspGetDate {
        public int pageNum;//当前页(Integer)
        public List<DateData> list = new ArrayList<>();
        public int pageSize;
        public int size;
        public int startRow;
        public int endRow;
        public int total;
        public int pages;
        public int firstPage;
        public int prePage;
        public int nextPage;
        public int lastPage;
        public boolean isFirstPage;
        public boolean isLastPage;
        public boolean hasPreviousPage;
        public boolean hasNextPage;
        public int navigatePages;
        public Object navigatepageNums;


    }

    /**
     * 发布约会
     */
    public static class ReqAddPersonalDate {
        public int userId;//用户主键id(Integer)
        public long activityTime;//约会活动时间
        public int dateTypeId;//约会类型id(Integer)
        public String dateTagNameArr = "";//约会标签名称集
        public String dateSignature = "";//约会说明
        public String datePhoto = "";//约会图片
        public int provinceId;//省份id(Integer)
        public int cityId;//城市id(Integer)
        public int districtId;//区域id(Integer)
        public double dateLongitude;//用户定位经度(Double)
        public double dateLatitude;//用户定位纬度(Double)
        public int isTop;//是否置顶(Integer)

    }

    /**
     * 发布约会
     */
    public static class RspAddPersonalDate {
    }

    /**
     * 获取用户池数据
     * 多功能接口
     */
    public static class ReqGetUserPool {
        public String pageNum = "";//分页信息(Integer)
        public String userIdFirst = "";//第一条用户id(Integer)

        public String userId = "";//查看的用户主键id(Integer)
        public String userNickname = "";//昵称

        public String userSex = "";//性别(Integer)
        public String userAgeBegin = "";//开始年龄(Integer)
        public String userAgeEnd = "";//结束年龄(Integer)
        public String cityId = "";//城市对应id(Integer)
        public String provinceId = "";//省份对应id(Integer)
        public String isAffirm = "";//0等待验证1未发起验证2通过认证5验证失败(Integer)


    }

    /**
     * 获取用户池数据
     */
    public static class RspGetUserPool {
        public int pageNum;//分页信息
        public int endRow;
        public int firstPage;
        public boolean hasNextPage;
        public boolean hasPreviousPage;
        public boolean isFirstPage;
        public boolean isLastPage;
        public int lastPage;
        public List<PhotoData> list = new ArrayList<>();
        public int navigatePages;
        public Object navigatepageNums;
        public int nextPage;
        public int pageSize;
        public int pages;
        public int prePage;
        public int size;
        public int startRow;
        public int total;

    }

    /**
     * 获取个人首页信息
     */
    public static class ReqGetMyIndex {
        public int userId;//该用户主键id(Integer)
    }

    /**
     * 获取个人首页信息
     */
    public static class RspGetMyIndex {
        public List<Viewers> seeMe = new ArrayList<>();
        public UserInfos userInfo = new UserInfos();
        public List<UserPhoto> userPhoto = new ArrayList<>();

        public static class UserInfos {
            public int userId;//该用户主键id(Integer)
            public String userBackground = "";//用户背景图片
            public String userVideo = "";//认证视频地址
            public int isAffirm;//0等待验证1未发起验证2通过认证5验证失败(Integer)
            public int userGold;//金币(Integer)
            public int userKey;//钥匙(Integer)
            public int seeNumber;//未读看过我的数量(Integer)
            public int interestNumber;//感兴趣数量(Integer)
            public int dateNumber;//发布约会数量(Integer)
        }
    }

    /**
     * 获取用户资料
     */
    public static class ReqGetPersonalInfo {
        public int userId;//用户id(Integer)

    }

    /**
     * 获取用户资料
     */
    public static class RspGetPersonalInfo {
        public int userId;//该用户主键id(Integer)
        public String userIcon = "";//用户头像
        public String userSignature = "";//用户个人说明
        public String userNickname = "";//用户昵称
        public int userSex;//用户性别(Integer)
        public int userAge;//用户年龄(Integer)
        public String userMobile = "";//联系方式
        public String userWX = "";//微信
        public String userQQ = "";//QQ
        public int userProvince;//用户省份
        public int userCity;//用户城市
        public int userDistrict;//用户区域
        public int userWeight;//用户体重(Integer)
        public int userHeight;//用户身高(Integer)
        public String userConstellation = "";//星座
        public String userQualification = "";//学历
        public String userProfession = "";//行业
        public String userIncome = "";//收入
        public String userGoodAt = "";//擅长
        public String userWantDo = "";//最近想做的事
        public String userOpinionLove = "";//对爱情的看法
        public String userOpinionHalf = "";//对另一半的看法
        public String userOpinionSex = "";//对性的看法
        public int vipLevel;//会员等级(Integer)
        public int charmLevel;//魅力等级(Integer)

    }

    /**
     * 获取看过我的人
     */
    public static class ReqGetSeeMe {
        public int userId;//用户id(Integer)
        public int pageNum;//当前页数(Integer)

    }

    /**
     * 获取看过我的人
     */
    public static class RspGetSeeMe {
        public int pageNum;//当前页(Integer)
        public List<Viewers> list = new ArrayList<>();//

        public int endRow;
        public int firstPage;
        public boolean hasNextPage;
        public boolean hasPreviousPage;
        public boolean isFirstPage;
        public boolean isLastPage;
        public int lastPage;
        public int navigatePages;
        public Object navigatepageNums;
        public int nextPage;
        public int pageSize;
        public int pages;
        public int prePage;
        public int size;
        public int startRow;
        public int total;
    }

    /**
     * 增加谁看过我关系
     */
    public static class ReqAddSeeMe {
        public int userId;//查看人主键id(Integer)
        public int otherUserId;//被查看人主键id(Integer)

    }

    /**
     * 增加谁看过我关系
     */
    public static class RspAddSeeMe {

    }

    /**
     * 增加看过我的人5个
     */
    public static class ReqAddAutoSeeMe{
        public int userId;//用户id(Integer)
        public int userSex;//用户性别(Integer)
    }

    /**
     * 增加看过我的人5个
     */
    public static class RspAddAutoSeeMe{

    }

    /**
     * 更新看过我的已读状态
     */
    public static class ReqUpdateSeeMe {
        public int userId;//用户主键id(Integer)

    }

    /**
     * 更新看过我的已读状态
     */
    public static class RspUpdateSeeMe {

    }

    /**
     * 获取个人相册
     */
    public static class ReqGetUserPhoto {
        public int userId;//查看人用户主键id(Integer)
        public int otherUserId;// 被查看用户id(Integer)
    }

    /**
     * 获取个人相册
     */
    public static class RspGetUserPhoto {
        // data : List<UserPhoto>
    }

    /**
     * 获取个人所有约会
     */
    public static class ReqGetPersonalDate {
        public int userId;//查看的用户主键id(Integer)
        public int pageNum;//分页信息(Integer)
        public int otherUserId;

    }

    /**
     * 获取个人所有约会
     */
    public static class RspGetPersonalDate {
        public int pageNum;//当前页(Integer)
        public List<Dating> list = new ArrayList<>();//约会集合

        public int endRow;
        public int firstPage;
        public boolean hasNextPage;
        public boolean hasPreviousPage;
        public boolean isFirstPage;
        public boolean isLastPage;
        public int lastPage;
        public int navigatePages;
        public Object navigatepageNums;
        public int nextPage;
        public int pageSize;
        public int pages;
        public int prePage;
        public int size;
        public int startRow;
        public int total;

    }

    /**
     * 获取个人所有感兴趣约会
     */
    public static class ReqGetInterestDate {
        public int pageNum;//分页信息(Integer)
        public int userId;//查看的用户主键id(Integer)

    }

    /**
     * 获取个人所有感兴趣约会
     */
    public static class RspGetInterestDate {
        public int pageNum;//当前页(Integer)
        public List<DateData> list = new ArrayList<>();//约会集合

        public int endRow;
        public int firstPage;
        public boolean hasNextPage;
        public boolean hasPreviousPage;
        public boolean isFirstPage;
        public boolean isLastPage;
        public int lastPage;
        public int navigatePages;
        public Object navigatepageNums;
        public int nextPage;
        public int pageSize;
        public int pages;
        public int prePage;
        public int size;
        public int startRow;
        public int total;

    }

    /**
     * 获取个人所有感兴趣约会
     */
    public static class ReqGetOtherInterestDate {
        public int pageNum;//分页信息(Integer)
        public int userId;//查看人用户主键id(Integer)
        public int otherUserId;//被查看人用户主键id(Integer)


    }

    /**
     * 获取个人所有感兴趣约会
     */
    public static class RspGetOtherInterestDate {
        public int pageNum;//当前页(Integer)
        public List<DateData> list = new ArrayList<>();//约会集合

        public int endRow;
        public int firstPage;
        public boolean hasNextPage;
        public boolean hasPreviousPage;
        public boolean isFirstPage;
        public boolean isLastPage;
        public int lastPage;
        public int navigatePages;
        public Object navigatepageNums;
        public int nextPage;
        public int pageSize;
        public int pages;
        public int prePage;
        public int size;
        public int startRow;
        public int total;

    }

    /**
     * 增加感兴趣约会关系
     */
    public static class ReqAddInterestDate {
        public int userId;//用户主键id(Integer)
        public int dateActivityId;//约会活动id(Integer)
        public int otherUserId;//被感兴趣约会发布者id(Integer)

    }

    /**
     * 增加感兴趣约会关系
     */
    public static class RspAddInterestDate {


    }

    /**
     * 删除感兴趣约会关系
     */
    public static class ReqDeleteInterestDate {
        public int userId;//用户主键id(Integer)
        public int dateActivityId;//约会活动id(Integer)

    }

    /**
     * 删除感兴趣约会关系
     */
    public static class RspDeleteInterestDate {


    }

    /**
     * 用户增加图片
     */
    public static class ReqAddUserPhoto {
        public int userId;//用户主键id(Integer)
        public String photoUrl;//图片地址
        public String photoSignature;//图片说明
        public int photoPrice;//图片价格(Integer)


    }

    /**
     * 用户增加图片
     */
    public static class RspAddUserPhoto {
    }


    /**
     * 用户删除图片
     */
    public static class ReqDeleteUserPhoto {
        public String photoIdArr;//图片id 多个用，拼接
    }

    /**
     * 用户删除图片
     */
    public static class RspDeleteUserPhoto {

    }

    /**
     * 获取个人相册总数
     */
    public static class ReqGetUserPhotoSum {
        public int userId;//用户主键id(Integer)


    }

    /**
     * 获取个人相册总数
     */
    public static class RspGetUserPhotoSum {

    }

    /**
     * 增加意见反馈
     */
    public static class ReqAddUserFeedback {
        public int userId;//用户主键id(Integer)
        public String feedbackPhoto;//反馈图片
        public String feedbackContent;//反馈内容


    }

    /**
     * 增加意见反馈
     */
    public static class RspAddUserFeedback {

    }

    /**
     * 增加举报消息
     */
    public static class ReqAddUserReport {
        public int userId;//用户主键id(Integer)
        public int otherUserId;//被举报用户id(Integer)
        public String reportPhoto;//举报图片
        public String reportContent;//举报内容

    }

    /**
     * 增加举报消息
     */
    public static class RspAddUserReport {

    }

    /**
     * 增加黑名单
     */
    public static class ReqAddBlacklist {
        public int userId;//拉黑人主键id(Integer)
        public int otherUserId;//被拉黑人主键id(Integer)
    }

    /**
     * 增加黑名单
     */
    public static class RspAddBlacklist {

    }

    /**
     * 删除黑名单
     */
    public static class ReqDeleteBlacklist {
        public int userId;//拉黑人主键id(Integer)
        public int otherUserId;//被拉黑人主键id(Integer)
    }

    /**
     * 删除黑名单
     */
    public static class RspDeleteBlacklist {

    }

    /**
     * 获取黑名单 userId
     * 判断黑名单 userId and otherUserIdArr
     */
    public static class ReqGetBlacklist {
        public int userId;//拉黑人主键id(Integer)
        public int otherUserId;//被拉黑人主键id(Integer)

    }

    /**
     * 获取黑名单
     * 判断黑名单
     */
    public static class RspGetBlacklist {
        // List<OtherUser>
    }

    /**
     * 获取粉丝
     */
    public static class ReqGetFans {
        public int userId;//用户主键id(Integer)
    }

    /**
     * 获取粉丝
     */
    public static class RspGetFans {
        // List<OtherUser>
    }

    /**
     * 增加关注
     */
    public static class ReqAddAttention {
        public int userId;//关注用户id(Integer)
        public int otherUserId;//被关注用户id(Integer)

    }

    /**
     * 增加关注
     */
    public static class RspAddAttention {

    }

    /**
     * 增加关注组
     */
    public static class ReqAddAttentionArr {
        public int userId;//关注用户id(Integer)
        public String otherUserIdArr;//被关注用户id集,隔开(Integer)

    }

    /**
     * 增加关注组
     */
    public static class RspAddAttentionArr {

    }

    /**
     * 删除关注
     */
    public static class ReqDeleteAttention {
        public int userId;//关注用户id(Integer)
        public int otherUserId;//被关注用户id(Integer)
    }

    /**
     * 删除关注
     */
    public static class RspDeleteAttention {

    }

    /**
     * 获取关注
     * 获取是否关注某用户关注
     */
    public static class ReqGetAttention {
        public int userId;//用户主键id(Integer)
        public int otherUserId;//被关注用户主键(Integer)
    }

    /**
     * 获取关注
     * 获取是否关注某用户关注
     */
    public static class RspGetAttention {
        // List<OtherUser>
    }

    /**
     * 获取好友
     * 获取是否和某好用户为好友
     */
    public static class ReqGetFriend {
        public int userId;//用户主键id(Integer)
        public int otherUserId;//另一用户主键(Integer)
    }

    /**
     * 获取好友
     * 获取是否和某好用户为好友
     */
    public static class RspGetFriend {
        // List<OtherUser>
    }

    /**
     * 删除好友
     */
    public static class ReqDeleteFriend {
        public int userId;//发起人用户id(Integer)
        public int otherUserId;//被动用户id(Integer)
    }

    /**
     * 删除好友
     */
    public static class RspDeleteFriend {

    }

    /**
     * 获取推送设置
     */
    public static class ReqGetPush {
        public int userId;//查询人(Integer)

    }

    /**
     * 获取推送设置
     */
    public static class RspGetPush {
        public int pushChat;//聊天推送0关闭1开启(Integer)
        public int pushAttention;//关注推送0关闭1开启(Integer)
        public int pushSee;//看过我推送0关闭1开启(Integer)
        public int pushInterest;//感兴趣推送0关闭1开启(Integer)
        public int pushInvite;//邀请类推送0关闭1开启(Integer)
        private int userId;//用户主键id
        private int deviceType;//设备类型(0安卓1苹果)
        private String deviceToken = "";//设备令牌

    }

    /**
     * 修改推送
     */
    public static class ReqUpdatePush {
        public int userId;//查询人(Integer)
        /**
         * 修改类别:
         * pushChat聊天推送
         * pushAttention关注推送
         * pushSee看过我推送
         * pushInterest感兴趣推送
         * pushInvite邀请类推送
         */
        public String pushType;//
        public int flag;//0关闭1开启(Integer)

    }

    /**
     * 修改推送
     */
    public static class RspUpdatePush {

    }

    /**
     * 推送邀请类
     */
    public static class ReqDoInvitePush {
        public int userId;//邀请推送人(Integer)
        public int otherUserId;//被邀请推送人(Integer)
        public int flag;//1邀请上传相册2邀请视频认真3邀请完善资料4邀请参加约会(Integer)
        public int dateActivityId;//对应约会(Integer) 当flag==4时

    }

    /**
     * 推送邀请类
     */
    public static class RspDoInvitePush {

    }

    /**
     * 聊天邀请
     */
    public static class ReqDoChatInvite {
        public int userId;//邀请推送人(Integer)
        public int otherUserId;//被邀请推送人(Integer)
        public int dateActivityId;//对应约会(Integer) 当flag==4时

    }

    /**
     * 聊天邀请
     */
    public static class RspDoChatInvite {

    }

    /**
     * 后台推送系统消息
     */
    public static class ReqGetSystemMessage {
        public int userId;//查看人(Integer)
        public int pageNum;//分页信息(Integer)


    }

    /**
     * 后台推送系统消息
     */
    public static class RspGetSystemMessage {

    }

    /**
     * 查询所有有趣度打分
     */
    public static class ReqGetFriendGrade {
        public int userId;//查询人(Integer)
    }

    /**
     * 查询所有有趣度打分
     */
    public static class RspGetFriendGrade {
        public float gradeNumber;//评价平均分数(Double)
        public int gradeSum;//评价人数(Integer)
        public List<GradeContent> gradeContent = new ArrayList<>();//评分内容


    }

    /**
     * 增加有趣度打分
     */
    public static class ReqAddFriendGrade {
        public int userId;//评价人(Integer)
        public int otherUserId;//被评价人(Integer)
        public String gradeContent;//有趣选项
        public float gradeNumber;//有趣度分数(Integer)

    }

    /**
     * 增加有趣度打分
     */
    public static class RspAddFriendGrade {

    }

    /**
     * 检查是否评价过
     */
    public static class ReqCheckFriendGrade {
        public int userId;//评价人(Integer)
        public int otherUserId;//被评价人(Integer)
    }

    /**
     * 检查是否评价过
     */
    public static class RspCheckFriendGrade {
        //code = 300 您已评价
    }

    /**
     * 获取用户个人值
     */
    public static class ReqGetUserPower {
        public int userId;//用户主键id(Integer)
    }

    /**
     * 获取用户个人值
     */
    public static class RspGetUserPower {
        public int userId;//用户主键id(Integer)
        public int userGold;//用户金币数量(Integer)
        public float userCharm;//用户魅力值(Integer)
        public int userWealth;//用户财富值(Integer)
        public int userKey;//用户钥匙数量(Integer)
        public int userPoint;//用户积分数量(Integer)
        public long receiveTime;//用户领取福利时间
        public int videoSee;//用户观看认证视频数量(Integer)
        public long videoTime;//观看认证视频时间

        public int vipLevel;//用户会员等级(Integer)
        public int charmLevel;//用户魅力等级(Integer)
        public int userFlower;//用户花朵数量(Integer)
    }


    /**
     * 版本更新
     */
    public static class ReqGetAppVersion{
        public String androidVersion;//当前安卓版本

        public String getAndroidVersion() {
            return androidVersion;
        }

        public void setAndroidVersion(String androidVersion) {
            this.androidVersion = androidVersion;
        }
    }

    /**
     * 版本更新
     */
    public static class RspGetAndroidVersion{
        int data;//data:0不需要强制更新1需要强制更新2提示更新

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }
    }

    /**
     * 获取礼物信息
     * 无参数将返回所有礼物
     */
    public static class ReqGetGift {
        public int giftId;//礼物对应id(Integer)
    }

    /**
     * 获取礼物信息
     */
    public static class RspGetGift {
        // data : list
    }

    /**
     * 赠送的礼物
     */
    public static class ReqGetOrderGiftSend {
        public int userId;//赠送人主键id(Integer)
    }

    /**
     * 收到的礼物
     */
    public static class ReqGetOrderGiftReceived {
        public int otherUserId;//被动接收人主键id(Integer)
    }

    /**
     * 是否赠送礼物
     */
    public static class ReqGetOrderGiftIsSend {
        public int userId;//赠送人主键id(Integer)
        public int otherUserId;//被动接收人主键id(Integer)
    }

    /**
     * 获取礼物信息
     */
    public static class RspGetOrderGift {
        public List<OrderGift> giftList = new ArrayList<>();//
        public int giftSum;//金币总价格(Integer)
    }

    /**
     * 购买金币创建订单接口
     */
    public static class ReqAddOrderDetail {
        public int userId;//购买人主键id(Integer)
        public String createIp = "";//创建ip
        public int orderChannel;//支付渠道0支付宝1微信2苹果内购(Integer)
        public String orderContent = "购买金币";//购买内容
        public float orderAmount;//订单金额(Double)
        public int orderNumber;//金币数量(Integer)
        public int isFirst;//首充优惠0或null否1是(Integer)


    }

    /**
     * 购买金币创建订单接口
     */
    public static class RspAddOrderDetail {
        public OrderDetail orderDetail;
        public Object pay;
    }

    /**
     * 购买金币成功之后确认接口
     */
    public static class ReqUpdateOrderDetail {
        public String orderNo;//订单号
        public String userCaptcha;//用户码
        public String orderToken = ""; // md5加密（orderNo + userId）
        public float orderAmount;//支付宝的真是金额

    }

    /**
     * 购买金币成功之后确认接口
     */
    public static class RspUpdateOrderDetail {

    }

    /**
     * 获取充值记录
     */
    public static class ReqGetOrderDetail {
        public int pageNum;//分页页数(Integer)
        public int userId;//用户主键id(Integer)

    }

    public static class VipLevelBean{
        public String content;
        public String vipLevel;

        public VipLevelBean(String content, String vipLevel) {
            this.content = content;
            this.vipLevel = vipLevel;
        }
    }


    /**
     * 获取充值记录
     */
    public static class RspGetOrderDetail {

        public int pageNum;
        public List<OrderDetail> list;
        public int pageSize;
        public int size;
        public int startRow;
        public int endRow;
        public int total;
        public int pages;
        public int firstPage;
        public int prePage;
        public int nextPage;
        public int lastPage;
        public boolean isFirstPage;
        public boolean isLastPage;
        public boolean hasPreviousPage;
        public boolean hasNextPage;
        public int navigatePages;
        public Object navigatepageNums;
    }

    /**
     * 获取是否可以优惠充值
     */
    public static class ReqGetFirst {
        public int userId;//用户主键id(Integer)

    }

    /**
     * 获取是否可以优惠充值
     */
    public static class RspGetFirst {

    }

    /**
     * 获取任务列表
     */
    public static class ReqGetTaskList {
        public int userId;//用户主键id(Integer)

    }

    /**
     * 获取任务列表
     */
    public static class RspGetTaskList {
        // list
        public int taskId;//任务id(Integer)
        public String taskContent;//任务内容
        public int keyNumber;//任务奖励钥匙(Integer)
        public String interfaceName;//接口名称
        public int isFinish;//是否完成0待完成1已领取2完成待领取(Integer)

    }


    /**
     * 存入用户完成任务并奖励钥匙
     */
    public static class ReqAddUserTask {
        public int userId;//用户id(Integer)
        public int taskId;//任务id(Integer)

    }

    /**
     * 存入用户完成任务并奖励钥匙
     */
    public static class RspAddUserTask {


    }


    /**
     * 领取钥匙
     */
    public static class ReqLoginReward {
        public int userId;//用户id(Integer)

    }

    /**
     * 领取钥匙
     */
    public static class RspLoginReward {
        //data:0新注册用户1普通用户 (Integer)

    }


    /**
     * 获取推送用户数据
     */
    public static class ReqGetUserPush {
        public int pushType;//用户类型0新注册用户1普通用户 (Integer)
        public int userSex;//性别(Integer)
        public double userLongitude;//经度(Double)
        public double userLatitude;//纬度(Double)

    }

    /**
     * 获取推送用户数据
     */
    public static class RspGetUserPush {

        public int pageNum;
        public int pageSize;
        public int size;
        public int startRow;
        public int endRow;
        public int total;
        public int pages;
        public int firstPage;
        public int prePage;
        public int nextPage;
        public int lastPage;
        public boolean isFirstPage;
        public boolean isLastPage;
        public boolean hasPreviousPage;
        public boolean hasNextPage;
        public int navigatePages;
        public List<ListBean> list;
        public Object navigatepageNums;

        public static class ListBean {
            public int userId;
            public String userNickname;
            public int userSex;
            public String userIcon;
            public String userAge;
            public String userVideo;
            public int vipLevel;
            public int isAffirm;
        }
    }


    /**
     * 使用钥匙购买权限接口
     */
    public static class ReqUpdateOrderKey {
        public int userId;//购买人主键id(Integer)
        public int otherUserId;//被动购买人主键id(Integer)
        public int buyType;//购买权限0聊天2认证视频3照片4看法(Integer)
        public String remarkInfo;//购买权限2视频地址3照片地址4时记录具体看法userOpinionSex
        public int keyNumber;//钥匙数量(Integer)
    }

    /**
     * 使用钥匙购买权限接口
     */
    public static class RspUpdateOrderKey {
        //data:
    }


    /**
     * 使用金币购买礼物接口
     */
    public static class ReqUpdateOrderGoldGift {
        public int userId;//购买人主键id(Integer)
        public int otherUserId;//被动购买人主键id(Integer)
        public String usedType = "gift";//购买类型gift礼物
        public int giftId;//礼物主键id(Integer)
        public int goldPrice;//金币价格(Integer)
        public String userCaptcha = "";//用户码

    }

    /**
     * 使用金币购买礼物接口
     */
    public static class RspUpdateOrderGoldGift {
        //data:
    }


    /**
     * 使用金币购买权限接口
     */
    public static class ReqUpdateOrderGoldRight {
        public int userId;//购买人主键id(Integer)
        public int otherUserId;//被动购买人主键id(Integer)
        public String usedType = "record";//购买类型record权限
        public int buyType;//购买权限0聊天1联系方式2视频聊天3照片4看法(Integer)
        public String remarkInfo;//购买权限3时照片地址4时记录具体看法userOpinionSex
        public int goldPrice;//金币价格(Integer)
        public String userCaptcha = "";//用户码

    }

    /**
     * 使用金币购买权限接口
     */
    public static class RspUpdateOrderGoldRight {
        //data:
    }


    /**
     * 查询用户所有购买权限记录
     */
    public static class ReqGetOrderRecord {
        public int userId;//购买人主键id(Integer)

    }

    /**
     * 查询用户之间购买记录 看法
     */
    public static class ReqGetOrderRecordOpinion {
        public int userId;//购买人主键id(Integer)
        public int otherUserId;//被动购买人主键id(Integer)
        public int buyType;//购买权限0聊天1联系方式2认证视频4看法(Integer)
        public String remarkInfo;//购买权限4时记录具体看法userOpinionSex

    }

    /**
     * 查询用户之间购买记录 0聊天1联系方式2认证视频
     */
    public static class ReqGetOrderRecordInter {
        public int userId;//购买人主键id(Integer)
        public int otherUserId;//被动购买人主键id(Integer)
        public int buyType;//购买权限0聊天1联系方式2认证视频4看法(Integer)

    }

    public static class RspGetOrderRecord {
        //data List<OrderRecord>
    }

    /**
     * 获取个人认证视频信息
     */
    public static class ReqGetPersonalVideoAffirm {
        public int userId;//用户id(Integer)

    }

    /**
     * 获取个人认证视频信息
     */
    public static class RspGetPersonalVideoAffirm {
        public String userVideo;//视频认证地址
        public int isAffirm;//视频认证状态0等待验证1未发起验证2通过认证5验证失败(Integer)

    }

    public static class ReqGetUserVideo{
        public int userId;
        public String userVideo;

    }

    /**
     * 删除约会
     */
    public static class ReqDeleteYueHui{
        public int dateActivityId;
    }


    /**
     * 提现请求参数
     */
    public static class ReqGetTianxian {
        public int userId;//提现人(Integer)
        public int withdrawalPoint;//提现积分(Integer)
        public int withdrawalChannel;//提现渠道0支付宝1微信(Integer)
        public String withdrawalAccount;//提现帐号

    }

    /**
     * 提现请求参数
     */
    public static class reqGetTixianRecord{
        public int userId;//提现人(Integer)
        public int pageNum;//提现人(Integer)
    }


    /**
     * 保存联系方式请求参数
     */
    public static class ReqGetSaveContact{
        public int userId;  //用户id
        public String userMobile;  //手机号
        public String userWX;  //微信号
        public String userQQ;   //qq号
    }

    /**
     * 获取提现记录
     */
    public static class RspGetTixianRecord {
        public int pageNum;
        public List<TixianRecord> list;
        public int pageSize;
        public int size;
        public int startRow;
        public int endRow;
        public int total;
        public int pages;
        public int firstPage;
        public int prePage;
        public int nextPage;
        public int lastPage;
        public boolean isFirstPage;
        public boolean isLastPage;
        public boolean hasPreviousPage;
        public boolean hasNextPage;
        public int navigatePages;
        public Object navigatepageNums;
    }


    /**
     * 获取可查看认证视频信息req
     */
    public static class ReqGetVideoSee{
        public int userId;
    }



    /**
     * 获取可查看认证视频信息rsp
     */
    public static class RspGetVideoSee{

    }

    /**
     * 获取他人主页数据
     */
    public static class ReqGetOtherIndex{
        public int userId;
        public int otherUserId;
    }

    /**
     * 获取他人主页数据
     */
    public static class RspGetOtherIndex{
        public int isTest;//是否马甲用户 为1表示是马甲用户
        public  List<UserShareBean> userShare;
    }

    public class UserShareBean{
        public String shareUrl;
        public int shareType;
    }

    /**
     * 查询个人有趣值列表
     */
    public static class ReqGetPersonalGrade{
        public int userId;
        public int pageNum;
    }

    /**
     * 查询个人有趣值列表
     */
    public static class RspGetPersonalGrade {
       public List<CommentInfo>list=new ArrayList<>();
        public int pageNum;//当前页(Integer)
        public int pageSize;
        public int size;
        public int startRow;
        public int endRow;
        public int total;
        public int pages;
        public int firstPage;
        public int prePage;
        public int nextPage;
        public int lastPage;
        public boolean isFirstPage;
        public boolean isLastPage;
        public boolean hasPreviousPage;
        public boolean hasNextPage;
        public int navigatePages;
        public Object navigatepageNums;

    }


    public static class CommentInfo{
        public String userNickname;
        public String userIcon;
        public int userId;
        public int otherUserId;
        public String gradeContent;
        public int gradeNumber;
        public long createTime;
    }


    /**
     * 后台推送系统消息
     */
    public static class ReqCircleGetSystemMessage{
        public int userId;
        public int pageNum;
    }


    /**
     * 后台推送系统消息
     */
    public static class RspCircleGetSystemMessage{
        public List<SystemMessageInfo>list=new ArrayList<>();
        public Object data;
    }

    public static class SystemMessageInfo{
        public String userIcon;
        public int userId;
        public int otherUserId;
        public String  messageContent;
        public String  userNickname;
        public long createTime;

    }

    /**
     * 获取系统邀请约会消息  port_circle_getSystemInvite
     */
    public static class ReqCircleGetSystemInvite{
        public int userId;
        public int pageNum;
    }

    /**
     * 获取系统邀请约会消息  port_circle_getSystemInvite
     */
    public static class RspCircleGetSystemInvite{
        public int pageNum;
        public List<SystemInviteInfo>list=new ArrayList<>();
    }

    public static class SystemInviteInfo{
        public int userId;
        public String  userNickname;
        public String userIcon;
        public int dateActivityId;
        public String dateTypeName;
        public long createTime;
    }


    /**
     * 保存分享
     */
    public static class ReqAddUserShare{
        public int userId;//用户id(Integer)
        public String showUrl;//视频略缩图地址
        public String shareUrl;//分享内容地址
        public String shareSignature;//说明
        public int shareType;//分享类型0视频1其他
        public String  shareLongitude;//经度
        public String shareLatitude;//纬度
        public int shareTopicId;//话题分享
    }

    /**
     * 保存分享
     */
    public static class RspAddUserShare{

    }

    /**
     * 删除分享
     */
    public static class ReqDeleteUserShare{
        public int shareId;
    }

    /**
     * 获取视频分享
     */
    public static class ReqGetUserShare{
        public int pageNum;//分页
        public int shareType;//传入0:视频
        public String  shareLongitude;//经度
        public String shareLatitude;//纬度
    }

    /**
     * 获取视频分享
     */
    public static class RspGetUserShare{
        public int shareId;//分享id
        public int userId;//用户Id
        public String userIcon;//头像
        public String userNickname;//昵称
        public String showUrl;//视频略缩图地址
        public String shareUrl;//分享地址
        public String shareSignature;//分享说明
        public int shareType;//分享类型0
        public float shareDistance;//距离多少KM
        public int isTop;//是否置顶
        public int isRelay;//是否转发
        public String otherUserNickname;//转发人
        public long createTime;//视频发布时间
        public long insertTime;//数据生成时间
        public String shareTopicName;//话题内容
    }

    /**
     * 获取所有分享
     */
    public static class RspGetAllUserShare{
        public int shareId;//分享id
        public int userId;//用户Id
        public String userIcon;//头像
        public String userNickname;//昵称
        public int userSex;//性别
        public int  userAge;//年龄
        public int isAffirm;//视频认证
        public int vipLevel;//会员等级
        public String showUrl;//视频略缩图地址
        public String shareUrl;//分享地址
        public String shareSignature;//分享说明
        public int shareType;//分享类型0视频1其他
        public float shareDistance;//距离多少KM
        public int isTop;//是否置顶
        public int isRelay;//是否转发
        public long createTime;//视频发布时间
        public long insertTime;//数据生成时间
        public String  relaySignature;//转发说明
        public String otherUserId;//转发人
        public String otherUserNickname;//转发人昵称
        public String  otherUserIcon;//头像
        public int  otherUserSex;//转发人性别
        public int   otherUserAge;//转发人年龄
        public int  otherIsAffirm;//转发人视频认证
        public int otherVipLevel;//转发人会员等级
        public String shareTopicName;//话题内容

    }

    /**
     * 获取个人分享
     */
    public static class ReqGetPersonalShare{
        public int pageNum;//分页
        public int userId;//用户id
    }

    /**
     * 获取个人分享
     */
    public static class RspGetPersonalShare{
        public int shareId;//分享id
        public int userId;//用户Id
        public String userIcon;//头像
        public String userNickname;//昵称
        public int userSex;//性别
        public int  userAge;//年龄
        public int isAffirm;//视频认证
        public int vipLevel;//会员等级
        public String showUrl;//视频略缩图地址
        public String shareUrl;//分享地址
        public String shareSignature;//分享说明
        public int shareType;//分享类型0视频1其他
        public float shareDistance;//距离多少KM
        public int isTop;//是否置顶
        public int isRelay;//是否转发
        public long createTime;//视频发布时间
        public long insertTime;//数据生成时间
        public String  relaySignature;//转发说明
        public String otherUserId;//转发人
        public String otherUserNickname;//转发人昵称
        public String  otherUserIcon;//头像
        public int  otherUserSex;//转发人性别
        public int   otherUserAge;//转发人年龄
        public int  otherIsAffirm;//转发人视频认证
        public int otherVipLevel;//转发人会员等级
        public String shareTopicName;//话题内容
    }

    /**
     * 获取话题
     */
    public static class ReqGetShareTopic{

    }

    /**
     * 获取话题
     */
    public static class RspGetShareTopic implements Serializable{
       public int shareTopicId;//话题对应id(Integer)
       public String shareTopicName;//话题名字
    }


    /**
     * 获取好友(所有，包括好友，关注，粉丝，黑名单)外框标识
     */
    public static class ReqGetFriendAllTag{
        public int userId;
    }

    /**
     * 获取好友标识
     */
    public static class ReqGetFriendTag{
        public int userId;
    }

    /**
     * 获取粉丝标识
     */
    public static class ReqGetFansTag{
        public int userId;
    }











//=================================================================


    /**
     * 购买记录
     */
    public static class OrderRecord {
        public int userId;//购买人主键id(Integer)
        public int otherUserId;//被动购买人主键id(Integer)
        public long createTime;//购买时间
        public int buyType;//购买权限0聊天1联系方式2认证视频3照片4看法(Integer)
        public String remarkInfo;//购买权限3时照片地址4时详细意见
        public float goldPrice;//金币价格(Integer)
    }

    /**
     * 订单详情
     */
    public static class OrderDetail {
        public String orderNo;//订单号
        public int userId;//购买人主键id(Integer)
        public long createTime;//创建时间
        public long updateTime;//修改时间
        public String outOrderNo;//外部订单号
        public int orderStatus;//订单状态(Integer)
        public String createIp;//创建ip
        public int orderChannel;//支付渠道0支付宝1微信2苹果内购(Integer)
        public String orderContent;//购买内容
        public float orderAmount;//订单金额(Double)
        public int orderNumber;//金币数量(Integer)

    }

    /**
     * 微信支付
     */
    public static class WechatPay {

        public String sign;
        public String timestamp;
        public String noncestr;
        public String partnerid;
        public String prepayid;
        @SerializedName("package")
        public String packageX;
        public String appid;
    }

    /**
     * 支付
     */
    public static class AliPay {
        public String body;// 例：购买金币
        public String _input_charset;// 例：utf-8
        public String it_b_pay;// 例：15m
        public String total_fee;// 例：0.01
        public String subject;// 例：趣陪购买金币服务
        public String notify_url;// 例：wangqiaosai.vicp.hk:18165/notify/alipayNotify
        public String service;// 例：mobile.securitypay.pay
        public String seller_id;// 例：277841278@qq.com
        public String partner;// 例：2088021402797428
        public String out_trade_no;// 例：G201704121039496577117
        public String payment_type;// 例：趣陪购买金币服务",
        public String rsa_key;// 例：MIICeAIBADANBgkqhki...

    }

    /**
     * 礼物
     */
    public static class Gift {
        public int giftId;//礼物对应id(Integer)
        public String giftName = "";//礼物名字
        public String giftIcon = "";//礼物图标
        public int giftPrice;//礼物价格(Double)
        public String giftWord = "";//礼物单位
        public boolean isChecked;  //选中

        public int getGiftId() {
            return giftId;
        }

        public void setGiftId(int giftId) {
            this.giftId = giftId;
        }

        public String getGiftName() {
            return giftName;
        }

        public void setGiftName(String giftName) {
            this.giftName = giftName;
        }

        public String getGiftIcon() {
            return giftIcon;
        }

        public void setGiftIcon(String giftIcon) {
            this.giftIcon = giftIcon;
        }

        public int getGiftPrice() {
            return giftPrice;
        }

        public void setGiftPrice(int giftPrice) {
            this.giftPrice = giftPrice;
        }

        public String getGiftWord() {
            return giftWord;
        }

        public void setGiftWord(String giftWord) {
            this.giftWord = giftWord;
        }

        public boolean isChecked() {
            return isChecked;
        }

        public void setChecked(boolean checked) {
            isChecked = checked;
        }
    }

    /**
     * 以被赠送礼物
     */
    public static class OrderGift {
        public int userId;//赠送主键id(Integer)
        public int otherUserId;//被动接收人主键id(Integer)
        public long createTime;//购买时间
        public int giftId;//礼物主键id(Integer)
        public int goldPrice;//金币价格(Integer)
        public String userNickname = "";//
        public String userIcon = "";//
        public String giftName = "";//礼物名字
        public String giftIcon = "";//礼物图标
    }

    /**
     * 评分内容
     */
    public static class GradeContent {
        public String name;//有趣选项
        public int number;//数量(Integer)
    }


    /**
     * 黑名单
     */
    public static class OtherUser {
        public int userId;//被拉黑人id(Integer)
        public String userIcon = "";//被拉黑人头像
        public String userNickname = "";//被拉黑人昵称
        public int userAge;//被拉黑人年龄(Integer)
        public int userSex;//被拉黑人性别(Integer)
        public int userHeight;//身高(Integer)
        public int vipLevel;//会员等级(Integer)
        public String userConstellation = "";//星座
        public long createTime;//被拉黑时间

    }

    /**
     * 约会
     */
    public static class Dating {
        public int dateActivityId;//约会主键id(Integer)
        public long createTime;//约会发布时间
        public long activityTime;//约会活动时间
        public String dateTypeName = "";//约会类型名称
        public String dateTagNameArr = "";//约会标签名称集
        public String dateSignature = "";//约会说明
        public String datePhoto = "";//约会图片
        public int dateProvince;//发布者省份
        public int dateCity;//发布者城市
        public int dateDistrict;//发布者区域
        public int isTop;//是否置顶(Integer)
        public int isInterest;// 0 false 1 true


    }

    public static class VideoAffer{
        public String userVideo;//视频认证地址
        public int isAffirm;//视频认证状态
    }

    /**
     * 看过我的人
     */
    public static class Viewers {
        public int userId;//查看过我的用户主键id(Integer)
        public String userIcon = "";//查看过我的用户头像
        public String userNickname = "";//查看过我的用户昵称
        public int userSex;//查看过我的用户性别(Integer)
        public int userAge;//查看过我的用户年龄(Integer)
        public long createTime;//查看我的时间
        public int userHeight;//身高(Integer)
        public int vipLevel;//会员等级(Integer)
        public String userConstellation = "";//星座
    }

    /**
     * 个人相册图片对象
     */
    public static class UserPhoto implements Serializable {
        public int photoId;//图片id(Integer)
        public long createTime;//图片上传时间
        public String photoUrl = "";//图片地址
        public int photoPrice;//图片价格(Integer)
        public String photoSignature = "";//图片说明
        public int isLook;// 收费图片是否有权限查看 1可查看 0不可查看
    }

    /**
     * 照片墙类
     */
    public static class PhotoData {
        public int userId;//查看的用户主键id(Integer)
        public String userNickname = "";//昵称
        public int userSex;//性别(Integer)
        public String userIcon = "";//头像
        public int userAge;//年龄(Integer)
        public String userVideo = "";//用户认证视频
        public int vipLevel;//会员等级(Integer)
        public int isAffirm;//0等待验证1未发起验证2通过认证5验证失败(Integer)
    }

    /**
     * 用户所有数据
     */
    public static class DateData {
        public int userId;//约会信息对应用户主键id(Integer)
        public String userNickname = "";//用户名称
        public String userIcon = "";//用户头像
        public int userAge;//年龄(Integer)
        public int userHeight;//身高(Integer)
        public int userSex;//性别(Integer)
        public String userMobile = "";//联系号码
        public String userWX = "";//微信
        public String userQQ = "";//QQ
        public String userConstellation = "";//星座
        public String userProfession = "";//行业
        public int dateActivityId;//约会主键id(Integer)
        public long createTime;//约会发布时间 年月日时分秒
        public long activityTime;//约会活动时间
        public String dateTypeName = "";//约会类型名称
        public String dateTagNameArr = "";//约会标签名称集
        public String dateSignature = "";//约会说明
        public String datePhoto = "";//约会图片 可能为1、2、3张图片 用英文逗号隔开
        public double dateLongitude;//发布者经度(Double)
        public double dateLatitude;//发布者纬度(Double)
        public double dateDistance;//发布者距离(Double)
        public int dateProvince;//发布者省份(Integer)
        public int dateCity;//发布者城市(Integer)
        public int dateDistrict;//发布者区域(Integer)
        public int isTop;//是否置顶(Integer)
        public int vipLevel;//会员等级(Integer)
        public int isTest;//为1表示为马甲用户显示定位地点


        /*
         使用 userId、userIcon、dateActivityId
         */
        public List<DateData> integerDatePerson = new ArrayList<>();
        public int integerDatePersonSum;
        public int isInterest;// 0 false 1 true
    }

    /**
     * 提现记录
     */
    public static class TixianRecord{
        public int withdrawalId;   //提现记录id
        public int withdrawalStatus;//状态0等待确认1关闭提现2已完成5提现失败(Integer)
        public int userId;//用户id
        public int withdrawalPoint;//提现金币
        public double withdrawalAmount;//提现金额
        public long createTime;//提现创建时间
        public long updateTime;//提现修改时间
        public int withdrawalChannel;//提现渠道0支付宝1微信
        public String  withdrawalAccount;//提现帐号
    }


    /**
     * add 2017/6/24
     */

    //视频通话扣费
    public static class ReqUpdateOrderVideo{
        public int userId;//用户id
        public int otherUserId;//接收方id
        public int goldPrice;//金币数量
    }
    public static class RspUpdateOrderVideo{

    }

    //视频通话时长记录
    public static class ReqOrderVideoTime{
        public int userId;//用户id
        public int otherUserId;//接收方id
        public long videoTime;//通话时长
        public int videoGold;

    }
    public static class RspOrderVideoTime{

    }

    //视频通话扣费金币
    public static class ReqVideoAmount{

    }

    public static class RspVideoAmount{

    }

    //保存个人宣传视频
    public static class ReqUserVideo{
        public int userId;//用户id(Integer)
        public String showUrl;//视频略缩图地址
        public String videoUrl;//视频地址
        public String videoSignature;//说明
        public String videoTopicId;//分享话题无则空
    }
    public static class RspUserVideo{

    }

    //删除分享
    public static class ReqDeleteUserVideo{
        public int videoId;//分享id
    }
    public static class RspDeleteUserVideo{

    }

    //获取所有宣传视频
    public static class ReqGetUserVideo2{
        public int pageNum;//分页
        public int videoTopicId;//话题id
    }
    public static class RwpGetUserVideo2 implements Serializable{
        public int videoId;//视频id
        public int userId;//用户Id
        public String  userIcon;//头像
        public String userNickname;//昵称
        public long createTime;//视频发布时间
        public String showUrl;//视频略缩图地址
        public String videoUrl;//视频地址
        public String videoSignature;//视频说明
        public String videoTopicName;//话题内容
        public int isTop;//是否置顶
        public int isTest;//是否马甲用户
        public String disturbTime;//免打扰时间
        public int videoGold;//视频金币

        public int videoTopicId;
        public int isVideoTopic;  //0表示是正常视频  1表示是话题
    }

    //获取个人宣传视频
    public static class ReqGetPersonalVideo{
        public int pageNum;//分页
        public int userId;//用户id
    }
    public static class RspGetPersonalVideo{
        public int videoId;//视频id
        public int userId;//用户Id
        public String userIcon;//头像
        public String userNickname;//昵称
        public long createTime;//视频发布时间
        public String showUrl;//视频略缩图地址
        public String videoUrl;//视频地址
        public String videoSignature;//视频说明
        public String videoTopicName;//话题内容
        public int isTop;//是否置顶
    }

    //增加用户免打扰时间
    public static class ReqAddUserVideoDisturb{
        public int userId;//用户id(Integer)
        public String  disturbTime;//免打扰时间
    }
    public static class RspAddUserVideoDisturb{

    }

    //获取用户免打扰时间
    public static class ReqGetUserVideoDisturb{
        public int userId;//用户id(Integer)
    }

    /**
     * add 2017 6 26
     */
    //判断用户是否为马甲用户
    public static class ReqGetUserIsTest{
        public int userId;//用户id(Integer)
    }

    /**
     * add 20107 6 27
     */
    //增加用户视频设置
    public static class ReqAddUserVideoInstall{
        public int userId;//用户id(Integer)
        public int isVideo;//视频开启状态0否1是
        public String disturbTime;//免打扰时间
        public int videoGold;//金币价格
    }
    public static class RspAddUserVideoInstall{

    }

    //获取用户视频设置
    public static class ReqGetUserVideoInstall{
        public int userId;//用户id(Integer)
    }
    public static class RspGetUserVideoInstall{
        public int isVideo;//视频开启状态0否1是
        public String disturbTime;//免打扰时间
        public int  videoGold;//金币价格
    }

    //获取视频聊话题
    public static class ReqGetVideoTopic{

    }
    public static class RspGetVideoTopic{
        public int videoTopicId;//话题对应id(Integer)
        public String videoTopicName;//话题名字
    }


    //获取金币消耗

    public static class ReqGetUserGoldOrPoint{
        public int userId;//用户id(Integer)
        public int type;//0权限1礼物2视频
    }

    //获取用户积分
    public static class ReqGetUserGoldOrPoint2{
        public int otherUserId;//用户id(Integer)
    }

    /**
     * 通话记录
     */
    public static class RspGetUserGoldPoint{
        public int userId;//用户id
        public String userIcon;//用户头像
        public String  userNickname;//用户昵称
        public int otherUserId;//用户otherUserId
        public String otherUserIcon;//
        public String otherUserNickname;
        public int type;//消耗类型0聊天1联系方式2认证视频3精华照片4看法5礼物6视频通话
        public int videoTime;//通话时长
        public long createTime;//发起时间
    }

    /**
     * 金币消耗
     */
     public static class ReqUserWithdrawalDetailGold{
        public int userId;
    }

    public static class RspUserWithdrawalDetailGold{
        public int userId;
        public String userIcon;
        public String userNickname;
        public int type;
        public int userGold;
        public int userPoint;
        public long createTime;
    }

    /**
     * 获取积分
     */
    public static class ReqUserWithdrawalDetailJiFen{
        public int otherUserId;
    }


    /**
     * 送礼提问
     */
    public static class ReqAddOrderProblem{
        public int userId;//提问用户id(Integer)
        public int otherUserId;//回答用户id(Integer)
        public String problemContent;//问题
        public int giftId;//礼物id
    }
    public static class RspAddOrderProblem{
        public int problemId;//问题id(Integer)
    }

    /**
     * 回答送礼提问
     */
    public static class ReqUpdateOrderProblem{
        public int userId;//提问用户id(Integer)
        public int otherUserId;//回答用户id(Integer)
        public int problemId;//问题Id(Integer)
    }

    /**
     * 检测礼物是否已经接受
     */
    public static class ReqCheckOrderProblem{
        public int problemId;//问题id(Integer)
    }



    /**
     * add 2017/8/4
     */

    //增加视频点赞次数
    public static class ReqAddVideoLike{
        public int userId;//用户id(Integer)
        public int videoId;//视频id(Integer)
    }
    public static class RspAddVideoLike{

    }

    //删除视频点赞次数
    public static class ReqDeleteVideoLike{
        public int userId;//用户id(Integer)
        public int videoId;//视频id(Integer)
    }
    public static class RspDeleteVideoLike{

    }

    //保存视频评论
    public static class ReqAddVideoComment{
        public int userId;//用户id(Integer)
        public int videoId;//视频id(Integer)
        public String videoComment;//评论
    }
    public static class RspAddVideoComment{

    }

    //获取视频详细内容
    public static class ReqGetVideoDetailByVideoId{
        public int userId;//用户id(Integer)
        public int videoId;//视频id(Integer)
        public String type;//传入0表示个人列表,其他的不用传
    }

    public static class RspGetVideoDetailByVideoId{
        public int isLike;//用户是否点赞
        public int likeNumber;//点赞数量
        public int videoCommentNumber;//评论数量
        public List<VideoCommentBean> videoCommentList;
    }

    public static class VideoCommentBean{
        public long createTime;//评论时间
        public String videoComment;//评论内容
        public int userId;//评论人id
        public String userNickname;//评论人昵称
        public int userAge;//年龄
        public int  userSex;//性别
        public String userIcon;//头像
    }


    //判断视频免费通话次数
    public static class UserFreeVideo{
        public int userId;//提问用户id(Integer)
    }


    /**
     * add 2017/8/11
     */
    //获取视频话题
    public static class ReqVideoGetVideoTopic{
    }

    public static class RspVideoGetVideoTopic{
        public int videoTopicId;//话题id
        public String videoTopicName;//话题内容
        public String videoTopicIcon;//话题封面
        public int videoTopicPosition;//话题位置:1代表第一格
        public String videoTopicSignature;//话题说明
    }

    public static class ReqGetRYToken{
        public int userId;//用户id
        public String name;//昵称
        public String portraitUri;//头像
    }


}
