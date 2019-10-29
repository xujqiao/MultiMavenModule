package me.jxuao.chap8.anno;

public class ForumService {

    @NeedTest(value = true)
    public void deleteForum(int forumId) {
        System.out.println("删除模块: " + forumId);
    }

    @NeedTest(value = false)
    public void deleteTopic(int postId) {
        System.out.println("删除主题: " + postId);
    }
}
