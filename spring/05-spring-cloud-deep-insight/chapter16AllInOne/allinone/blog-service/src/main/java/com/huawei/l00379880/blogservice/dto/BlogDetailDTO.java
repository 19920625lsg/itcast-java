package com.huawei.l00379880.blogservice.dto;

import com.huawei.l00379880.blogservice.entity.Blog;
import com.huawei.l00379880.blogservice.entity.User;

/**
 * Created by fangzhipeng on 2017/7/10.
 */
public class BlogDetailDTO {
    private Blog blog;
    private User user;

    public Blog getBlog() {
        return blog;
    }

    public void setBlog(Blog blog) {
        this.blog = blog;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
