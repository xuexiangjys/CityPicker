package com.xuexiang.citypicker.adapter;

import com.xuexiang.citypicker.model.City;

/**
 * 城市选择监听
 *
 * @author xuexiang
 * @since 2018/12/30 下午6:46
 */
public interface OnPickListener {
    /**
     * 选择
     *
     * @param position
     * @param city
     */
    void onPick(int position, City city);

    /**
     * 定位
     *
     * @param listener
     */
    void onLocate(OnLocationListener listener);

    /**
     * 取消
     */
    void onCancel();
}
