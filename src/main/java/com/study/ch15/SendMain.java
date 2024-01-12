package com.study.ch15;

public class SendMain {
    public static void main(String[] args) {
        SendData<String> sd1 = new SendData<>(241, "000");
        //send(sd1);
        SendData<Member> sd2 = new SendData<>(278, new Member("박00", "01043215342"));
        send(sd2);
        SendData<VIPMember> sd3 = new SendData<>(290, new VIPMember("정00", "01022223333"));
        send(sd3);
    }

    public static void send(SendData<? super VIPMember> sendData) {
        sendData.send();
    }
}