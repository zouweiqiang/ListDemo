package com.nd.frt.recentconversation.service;

import android.content.Context;

import com.nd.frt.recentconversation.model.UserInfo;

import java.util.List;

public interface IUserInfo {

    List<UserInfo> getUserInfos(Context context);

}
