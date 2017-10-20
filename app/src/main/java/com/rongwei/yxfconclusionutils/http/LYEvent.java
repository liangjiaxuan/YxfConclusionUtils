package com.rongwei.yxfconclusionutils.http;

/**
 * Created by Administrator on 2017/4/7.
 */

public class LYEvent {

    /**
     * attention事件
     * sub: 关注列表、好友列表
     */
    public static class AttentionDataChangedEvent {
    }

    /**
     * 关注我通知
     * sub: 粉丝列表、好友列表
     */
    public static class FansDataChangedEvent {
    }

    /**
     * 拉黑、取消拉黑
     * sub 黑名单列表、约会页面
     */
    public static class BlacklistDataChangedEvent {
    }

    /**
     * 发布约会
     * sub 约会页面、我的页面：我的约会数量
     */
    public static class PublishDatingEvent {

    }

    /**
     * 感兴趣 (约会、我感兴趣的约会、他人感兴趣的约会)
     * sub 我的页面：感兴趣数量
     */
    public static class InterestEvent {
    }

    /**
     * 相册改变事件 上传、删除
     * sub 我的页面、我的资料
     */
    public static class PhotoChangedEvent{

    }

    /**
     * 账户改变事件(金币、钥匙等改变事件) 充值、消费、任务领取等
     * sub 购买礼物、购买照片、购买视频、购买关于、购买联系方式、购买聊天等
     * sub 我的页面
     */
    public static class AccountChangedEvent {

    }

    /**
     * 看过我的人改变事件 （新增、更新已读状态）
     * sub 我的页面
     */
    public static class ViewersChangedEvent{

    }

    /**
     * 邀约
     */
    public static class InviteYueHuiEvent{
        public int activityId;

        public InviteYueHuiEvent(int activityId) {
            this.activityId = activityId;
        }

        public int getActivityId() {
            return activityId;
        }

        public void setActivityId(int activityId) {
            this.activityId = activityId;
        }
    }

    /**
     * 邀请约会成功刷新
     */
    public static class InviteSuccessEvent{

    }

    /**
     * 删除约会成功刷新
     */
    public static class DeleteYueHuiSuccessEvent{

    }

    /**
     * 系统消息通知刷新
     */
    public static class SystemMessageFresh{

    }

    public static class SystemMessageFreshNum{
        public int sysNum;

        public SystemMessageFreshNum(int sysNum) {
            this.sysNum = sysNum;
        }
    }

    /**
     * 系统消息清除
     */
    public static class ClearSystemMessageFresh{

    }

    /**
     * 系统邀请消息通知刷新
     */
    public static class SystemInviteMessageFresh{

    }

    public static class SystemInviteMessageFreshNum{
        public int inviteNum;

        public SystemInviteMessageFreshNum(int inviteNum) {
            this.inviteNum = inviteNum;
        }
    }

    /**
     * 系统邀请消息清除
     */
    public static class ClearSystemInviteMessageFresh{

    }


    /**
     * 首充刷新
     */
    public static class FirstRechange{

    }

    /**
     * 分享刷新
     */
    public static class ShareFreshEvent{

    }

    /**
     * 删除个人分享
     */
    public static class DeleteMyDongtaiEvent{

    }

    /**
     * 扫描视频文件的广播
     */
    public static class ScanVideoFileEvent{

    }


    /**
     * 视频小于5秒的刷新
     */
    public static class GoTopaiVideoEvent{

    }

    /**
     * 选择视频
     */
    public static class ChooseVideoEvent{
        public String video_path;
        public String video_shoot;
        public String topic;
        public ChooseVideoEvent(String video_path, String video_shoot,String topic) {
            this.video_path = video_path;
            this.video_shoot = video_shoot;
            this.topic=topic;
        }
    }


    /**
     * 好友标识（外框）
     */
    public static class FriendAllTagEvent{

    }

    /**
     * 取消好友标识（外框）
     */
    public static class CancelFriendAllTagEvent{

    }

    /**
     * 好友标识
     */
    public static class FriendTagEvent{

    }

    public static class CancelFriendTagEvent{

    }

    /**
     * 关注标识
     */
    public static class AttationTagEvent{

    }

    public static class CancelAttationTagEvent{

    }

    /**
     * 粉丝标识
     */
    public static class FansTagEvent{

    }

    public static class CancelFansTagEvent{

    }


    /**
     * 黑名单标识
     */
    public static class HeiMingDanTagEvent{

    }

    public static class CancelHeiMingDanTagEvent{

    }


    /**
     * 加载本地视频完成标识
     */
    public static class VideoLoadFinishEvent{

    }


    /**
     * 回答礼物的时候选择本地视频
     */
    public static class GiftLocalVideoEvent{
        public int dur;
        public String path;

        public GiftLocalVideoEvent(int dur, String path) {
            this.dur = dur;
            this.path = path;
        }

        public int getDur() {
            return dur;
        }

        public void setDur(int dur) {
            this.dur = dur;
        }

        public String getPath() {
            return path;
        }

        public void setPath(String path) {
            this.path = path;
        }
    }

    /**
     * 滑动的时候自动播放视频
     */
    public static class VideoAutoEvent{
        public int position;

        public VideoAutoEvent(int position) {
            this.position = position;
        }

        public int getPosition() {
            return position;
        }

        public void setPosition(int position) {
            this.position = position;
        }
    }

    /**
     * 融云会话列表返回
     */
    public static class RyConvisationBack{

    }

    /**
     * 送礼提问视频
     */
    public static class RyGiftProblemVideoEvent{
        public String videoUrl;

        public RyGiftProblemVideoEvent(String videoUrl) {
            this.videoUrl = videoUrl;
        }
    }

    /**
     * 点击会话空白地方隐藏软键盘
     */
    public static class RyBlankClickEvent{

    }

    /**
     * 刷新会话列表
     */
    public static class RyFreshConversationListEvent{

    }

    /**
     * 删除微信  qq登录授权
     */
    public static class DeleteOauthEvent{

    }

    /**
     * 断网后重新连接网络后登陆融云
     */
    public static class NetReconnectRYEvent{

    }

}
