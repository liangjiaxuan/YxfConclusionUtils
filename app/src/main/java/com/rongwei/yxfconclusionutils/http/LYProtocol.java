package com.rongwei.yxfconclusionutils.http;

/**
 * Created by Administrator on 2017/2/21.
 */

public class LYProtocol {
    /**
     * webHost
     * release
     */
    //外网服务器
    public static final String webHost = "http://114.215.184.120:8088/";
    //内网服务器
//    public static final String webHost = "http://192.168.1.115:8080/";
    /**
     * webHost
     * debug
     */
    /*public static final String webHost = "http://192.168.1.103:8080/";*/
    /**
     * qiniuHost
     */
    public static final String qiniuHost = "http://7xlcz5.com1.z0.glb.clouddn.com/";
    /**
     * qiniuHost   app下载地址
     */
    public static final String shareApp = "http://114.215.184.120:8088/mobile/shareApp.html";
    /**
     * 分享视频
     */
    public static final String shareVideo = "http://114.215.184.120:8088/mobile/shareVideo.html";

    /**
     * 手机号码登录
     */
    public static final String port_login_user = "mobile/login/loginUser";

    /**
     * 第三方登录
     */
    public static final String port_login_um = "mobile/login/loginUM";

    /**
     * 缓存登录
     */
    public static final String port_login_cache = "mobile/login/cacheLogin";

    /**
     * 退出登录
     */
    public static final String port_logout = "mobile/login/loginOut";

    /**
     * 领取钥匙
     */
    public static final String port_login_reward = "mobile/login/loginReward";

    /**
     * 获取验证码
     */
    public static final String port_get_captcha = "mobile/getCaptcha";

    /**
     * 获取省份信息
     */
    public static final String port_cache_getProvince = "mobile/cache/getProvince";

    /**
     * 获取城市信息
     */
    public static final String port_cache_getCity = "mobile/cache/getCity";

    /**
     * 获取区域信息
     */
    public static final String port_cache_getDistrict = "mobile/cache/getDistrict";

    /**
     * 获取礼物信息
     */
    public static final String port_cache_getGift = "mobile/cache/getGift";

    /**
     * 获取约会类型列表
     */
    public static final String port_cache_getDateType = "mobile/cache/getDateType";

    /**
     * 获取约会信息标签
     */
    public static final String port_cache_getDateTag = "mobile/cache/getDateTag";

    /**
     * 获取约会内容
     */
    public static final String port_date_getDate = "mobile/date/getDate";

    /**
     * 发布约会
     */
    public static final String port_date_addPersonalDate = "mobile/date/addPersonalDate";

    /**
     * 增加感兴趣约会关系
     */
    public static final String port_date_addInteresDate = "mobile/date/addInterestDate";

    /**
     * 删除感兴趣约会关系
     */
    public static final String port_date_deleteInteresDate = "mobile/date/deleteInterestDate";

    /**
     * 获取个人所有约会
     */
    public static final String port_date_getPersonalDate = "mobile/date/getPersonalDate";

    /**
     * 删除个人约会
     */
    public static final String port_date_deletePersonalDate = "mobile/date/deletePersonalDate";

    /**
     * 更新约会
     */
    public static final String port_date_updatePersonalDate = "mobile/date/updatePersonalDate";

    /**
     * 获取个人所有感兴趣约会
     */
    public static final String port_date_getInteresDate = "mobile/date/getInterestDate";

    /**
     * 获取个人所有感兴趣约会
     */
    public static final String port_date_getOtherInterestDate = "mobile/date/getOtherInterestDate";

    /**
     * 更新个人背景图片
     */
    public static final String port_user_updateUserBackground = "mobile/user/updateUserBackground";

    /**
     * 检查个人资料完善
     */
    public static final String port_user_checkUserInfo = "mobile/user/checkUserInfo";

    /**
     * 更新用户初始化信息
     */
    public static final String port_user_addUserInit = "mobile/user/addUserInit";

    /**
     * 获取个人首页信息
     */
    public static final String port_user_getMyIndex = "mobile/user/getMyIndex";

    /**
     * 更新看过我的已读状
     */
    public static final String port_user_updateSeeme = "mobile/user/updateSeeMe";

    /**
     * 增加看过我
     */
    public static final String port_user_addSeeMe = "mobile/user/addSeeMe";

    /**
     * 用户删除图片
     */
    public static final String port_user_deleteUserPhoto = "mobile/user/deleteUserPhoto";

    /**
     * 用户增加图片
     */
    public static final String port_user_addUserPhoto = "mobile/user/addUserPhoto";

    /**
     * 获取可查看认证视频信息
     */
    public static final String port_user_getVideoSee = "mobile/user/getVideoSee";

    /**
     * 增加修改视频认证数据
     */
    public static final String port_user_updateUserVideo = "mobile/user/updateUserVideo";

    /**
     * 获取用户资料
     */
    public static final String port_user_getPersonalInfo = "mobile/user/getPersonalInfo";

    /**
     * 获取用户个人值
     */
    public static final String port_user_getUserPower = "mobile/user/getUserPower";

    /**
     * 修改用户资料
     */
    public static final String port_user_updatePersonalInfo = "mobile/user/updatePersonalInfo";

    /**
     * 增加意见反馈
     */
    public static final String port_user_addUserFeedback = "mobile/user/addUserFeedback";

    /**
     * 增加关注
     */
    public static final String port_circle_addAttention = "mobile/circle/addAttention";

    /**
     * 增加关注以及聊天权限组
     */
    public static final String port_circle_addAttentionArr = "mobile/circle/addAttentionOrRecordArr";

    /**
     * 删除关注
     */
    public static final String port_circle_deleteAttention = "mobile/circle/deleteAttention";

    /**
     * 获取关注
     * 获取是否关注某用户关注
     */
    public static final String port_circle_getAttention = "mobile/circle/getAttention";

    /**
     * 获取好友
     * 获取是否和某好用户为好友
     */
    public static final String port_circle_getFriend = "mobile/circle/getFriend";

    /**
     * 删除好友
     */
    public static final String port_circle_deleteFriend = "mobile/circle/deleteFriend";

    /**
     * 增加黑名单
     */
    public static final String port_circle_addBlacklist = "mobile/circle/addBlacklist";

    /**
     * 删除黑名单
     */
    public static final String port_circle_deleteBlacklist = "mobile/circle/deleteBlacklist";

    /**
     * 判断黑名单
     * 获取黑名单
     */
    public static final String port_circle_getBlacklist = "mobile/circle/getBlacklist";

    /**
     * 获取粉丝
     */
    public static final String port_circle_getFans = "mobile/circle/getFans";

    /**
     * 购买金币创建订单接口
     */
    public static final String port_order_addOrderDetail = "mobile/order/addOrderDetail";

    /**
     * 购买金币成功之后确认接口
     */
    public static final String port_order_updateOrderDetail = "mobile/order/updateOrderDetail";

    /**
     * 获取充值记录
     */
    public static final String port_order_getOrderDetail = "mobile/order/getOrderDetail";

    /**
     * 使用钥匙购买权限接口
     */
    public static final String port_order_updateOrderKey = "mobile/order/updateOrderKey";

    /**
     * 使用金币购买钥匙
     * 使用金币购买礼物接口
     * 使用金币购买权限接口
     * 使用金币购买权限接口
     */
    public static final String port_order_updateOrderGold = "mobile/order/updateOrderGold";

    /**
     * 获取礼物信息
     */
    public static final String port_order_getOrderGift = "mobile/order/getOrderGift";

    /**
     * 查询用户所有购买权限记录
     * 查询用户之间购买记录
     */
    public static final String port_order_getOrderRecord = "mobile/order/getOrderRecord";

    /**
     * 查询用户会员购买记录
     */
    public static final String port_order_getOrderVip = "mobile/order/getOrderVip";

    /**
     * 获取七牛上传密匙
     * 不需要参数
     * 返回值token 对应data
     */
    public static final String port_config_getQiniuToken = "mobile/config/getQiniuToken";

    /**
     * 获取用户池数据
     */
    public static final String port_pool_getUserPool = "mobile/pool/getUserPool";

    /**
     * 获取支付方式
     */
    public static final String port_order_getIsPay = "mobile/order/getIsPay";

    /**
     * 增加举报消息
     */
    public static final String port_circle_addUserReport = "mobile/circle/addUserReport";

    /**
     * 邀约马甲用户
     */
    public static final String port_circle_getUserVest = "mobile/circle/getUserVest";

    /**
     * 获取推送用户数据
     */
    public static final String port_pool_getUserPush = "mobile/pool/getUserPush";

    /**
     * 增加有趣度打分
     */
    public static final String port_user_addFriendGrade = "mobile/user/addFriendGrade";

    /**
     * 查询所有有趣度打分
     */
    public static final String port_user_getFriendGrade = "mobile/user/getFriendGrade";

    /**
     * 检查是否评价过
     */
    public static final String port_user_checkFriendGrade = "mobile/user/checkFriendGrade";

    /**
     * 获取推送设置
     */
    public static final String port_circle_getPush = "mobile/circle/getPush";

    /**
     * 修改推送
     */
    public static final String port_circle_updatePush = "mobile/circle/updatePush";

    /**
     * 推送邀请类
     */
    public static final String port_circle_doInvitePush = "mobile/circle/doInvitePush";

    /**
     * 聊天邀请
     */
    public static final String port_circle_doChatInvite = "mobile/circle/doChatInvite";

    /**
     * 获取提现比例
     */
    public static final String port_cache_getWithDrawalFee = "mobile/cache/getWithdrawalFee";

    /**
     * 增加提现记录
     */
    public static final String port_order_addWithdrawal = "mobile/order/addWithdrawal";

    /**
     * 获取所有提现记录
     */
    public static final String port_order_getWithDrawal = "mobile/order/getWithdrawal";

    /**
     * 关闭提现
     */
    public static final String port_order_updateWithdrawal = "mobile/order/updateWithdrawal";

    /**
     * 获取用户看法
     */
    public static final String port_user_getUserOpinion = "mobile/user/getUserOpinion";

    /**
     * 获取是否可以优惠充值
     */
    public static final String port_order_getFirst = "mobile/order/getFirst";

    /**
     * 获取用户池数据(会员入口)
     */
    public static final String port_pool_getUserPoolOfVip = "mobile/pool/getUserPoolOfVip";


    /**
     * 获取已弹出任务窗状态
     */
    public static final String port_task_getTaskPop = "mobile/task/getTaskPop";

    /**
     * 存入任务弹出窗状态
     */
    public static final String port_task_addTaskPop = "mobile/task/addTaskPop";

    /**
     * 根据约会id获取约会信息
     */
    public static final String port_date_getDateActivity = "mobile/date/getDateActivity";

    /**
     * 获取任务列表
     */
    public static final String port_task_getTaskList = "mobile/task/getTaskList";

    /**
     * 存入用户完成任务并奖励钥匙
     */
    public static final String port_task_addUserTask = "mobile/task/addUserTask";

    /**
     * 增加看过我的人5个
     */
    public static final String port_pool_addAutoSeeMe = "mobile/pool/addAutoSeeMe";
    /**
     * 获取好友外框标识
     */
    public static final String port_circle_getAllTag = "mobile/circle/getAllTag";
    /**
     * 获取好友标识
     */
    public static final String port_circle_getFriendTag = "mobile/circle/getFriendTag";
    /**
     * 获取粉丝标识
     */
    public static final String port_circle_getAttentionTag = "mobile/circle/getAttentionTag";
    /**
     * 更新好友标识
     */
    public static final String port_circle_updateFriendTag = "mobile/circle/updateFriendTag";
    /**
     * 更新粉丝标识
     */
    public static final String port_circle_updateAttentionTag = "mobile/circle/updateAttentionTag";
    /**
     * 获取看过我的人
     */
    public static final String port_user_getSeeMe = "mobile/user/getSeeMe";
    /**
     * 获取个人相册
     */
    public static final String port_user_getUserPhoto = "mobile/user/getUserPhoto";
    /**
     * 获取个人相册总数
     */
    public static final String port_user_getUserPhotoSum = "mobile/user/getUserPhotoSum";
    /**
     * 赠送免费玫瑰花接口
     */
    public static final String port_order_updateOrderFlower = "mobile/order/updateOrderFlower";
    /**
     * 获取个人认证视频信息
     */
    public static final String port_user_getPersonalVideoAffirm = "mobile/user/getPersonalVideoAffirm";
    /**
     * 检测版本
     */
    public static final String port_get_andridversion = "mobile/cache/getAndroidVersion";

    /**
     * 保存分享
     */
    public static final String port_share_addusershare = "mobile/share/addUserShare";
    /**
     * 删除分享
     */
    public static final String port_share_deleteusershare = "mobile/share/deleteUserShare";
    /**
     * 获取视频分享（获取所有分享）
     */
    public static final String port_share_getusershare = "mobile/share/getUserShare";

    /**
     * 获取个人分享
     */
    public static final String port_share_getpersonalshare = "mobile/share/getPersonalShare";


    /**
     * 获取他人主页数据
     */
    public static final String port_get_other_index = "mobile/user/getOtherIndex";

    /**
     * 查询个人有趣值列表
     */
    public static final String port_get_personal_grade = "mobile/user/getPersonalGrade";

    /**
     * 后台推送系统消息
     */
    public static final String port_circle_getSystemMessage = "mobile/circle/getSystemMessage";

    /**
     * 获取系统邀请约会消息
     */
    public static final String port_circle_getSystemInvite = "mobile/circle/getSystemInvite";

    /**
     * 获取话题
     */
    public static final String port_getShareTopic = "mobile/cache/getShareTopic";


    /**
     * add  2017/6/24
     */
    //视频通话扣费
    public static final String port_updateOrderVideo="mobile/order/updateOrderVideo";

    //视频通话时长记录
    public static final String port_addOrderVideoTime="mobile/order/addOrderVideoTime";

    //视频通话扣费金币
    public static final String port_getVideoAmount="mobile/order/getVideoAmount";

    //保存个人宣传视频
    public static final String port_addUserVideo="mobile/video/addUserVideo";

    //删除分享
    public static final String port_deleteUserVideo="mobile/video/deleteUserVideo";

    //获取所有宣传视频
    public static final String port_getUserVideo="mobile/video/getUserVideo";

    //获取个人宣传视频
    public static final String port_getPersonalVideo="mobile/video/getPersonalVideo";

    //增加用户免打扰时间
    public static final String port_addUserVideoDisturb="mobile/video/addUserVideoDisturb";

    //获取用户免打扰时间
    public static final String port_getUserVideoDisturb="mobile/video/getUserVideoDisturb";

    //判断用户是否为马甲用户
    public static final String port_getUserIsTest="mobile/user/getUserIsTest";

    /**
     * add 2017 6 27
     */
    //增加用户视频设置
    public static final String port_addUserVideoInstall="mobile/video/addUserVideoInstall";
    //获取用户视频设置
    public static final String port_getUserVideoInstall="mobile/video/getUserVideoInstall";
    //获取视频聊话题
    public static final String port_getVideoTopic="mobile/cache/getVideoTopic";
    //获取金币消耗或者获取用户积分
    public static final String prot_getUserGoldSpent="mobile/order/getUserGoldOrPointDetail";
    //获取消耗的金币和积分
    public static final String port_getUserWithdrawalDetail="mobile/order/getUserWithdrawalDetail";

    /**
     * add 2017/7/27
     */
    //送礼提问
    public static final String port_addOrderProblem="mobile/order/addOrderProblem";
    //回答送礼提问
    public static final String port_updateOrderProblem="mobile/order/updateOrderProblem";
    //随机获取提问问题
    public static final String port_getProblemTopic="mobile/cache/getProblemTopic";

    //检测送礼提问
    public static final String port_checkOrderProblem="mobile/order/checkOrderProblem";

    /**
     * add 2017/8/4
     */
    //增加视频点赞次数
    public static final String port_addVideoLike="mobile/video/addVideoLike";
    //删除视频点赞次数
    public static final String port_deleteVideoLike="mobile/video/deleteVideoLike";
    //保存视频评论
    public static final String port_addVideoComment="mobile/video/addVideoComment";
    //获取视频详细内容
    public static final String port_getVideoDetailByVideoId="mobile/video/getVideoDetailByVideoId";
    //判断视频免费通话次数
    public static final String port_getUserFreeVideo="mobile/order/getUserFreeVideo";
    //消耗视频免费通话次数
    public static final String port_updateUserFreeVideo="mobile/order/updateUserFreeVideo";

    /**
     * add 2017/8/11
     */
    //获取视频显示话题
    public static final String port_videoGetVideoTopic="mobile/video/getVideoTopic";


    /**
     * add 2017/9/6
     */
    //获取融云的token
    public static final String port_userGetRYToken="mobile/user/getRYToken";


}
