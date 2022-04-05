package com.rdev.spello;

import androidx.annotation.NonNull;

import com.google.android.gms.ads.rewarded.RewardItem;

public class VideoReward implements RewardItem {

    public VideoReward(){}

    @Override
    public int getAmount() {
        return 0;
    }

    @NonNull
    @Override
    public String getType() {
        return null;
    }
}
