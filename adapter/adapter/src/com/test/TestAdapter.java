package com.test;

import com.adapter.GBSocketInterface;
import com.adapter.SocketAdapter;
import com.china.GBSocket;
import com.germany.Hotel;

public class TestAdapter {
	 
    public static void main(String[] args) {
    	
    	// 1 我去德国旅游，带去的充电器是国标的（可以将这里的GBSocket看成是充电器）
        GBSocketInterface gbSocket = new GBSocket();
        
        // 2 德国宾馆
        Hotel hotel = new Hotel();
        
        /*
         * 3 由于没法充电，我拿出随身带去的适配器，
         * 并且将我带来的充电器插在适配器的上端插孔中。
         * 这个上端插孔是符合国标的，我的充电器完全可以插进去。
         */
        SocketAdapter socketAdapter = new SocketAdapter(gbSocket);
        
        //4 再将适配器的下端插入宾馆里的德国插座上
        hotel.setSocket(socketAdapter);
        
        //5 最后充电
        hotel.charge();
    }
}