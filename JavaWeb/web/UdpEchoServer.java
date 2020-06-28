package JavaWeb.web;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UdpEchoServer {

    //创建应该服务器，首先要应该socket对象
    private DatagramSocket socket = null;

    //服务器程序启动的时候要和能够端口号关联起来

    public UdpEchoServer(int port) throws SocketException {
        socket = new DatagramSocket(port);
    }

    //实现服务器启动逻辑
    public void start() throws IOException {
        System.out.println("服务器启动");
        //一般服务器都是要一直运行的，所以这个程序正常情况下不会自己结束

        while (true) {
            //在这个一直执行的主循环中，主要执行以下逻辑：
            //1、读取请求并且解析
            //此处读取的过程就是把数据放到DatagramPacket 对象中
            //此处的解析过程很简单，把这个byte[]中的数据转成字符串

            DatagramPacket requestPacket = new DatagramPacket(new byte[4096],4096);
            socket.receive(requestPacket);
            String request = new String(requestPacket.getData(),0,requestPacket.getLength()).trim();
            //2、根据请求计算响应
            String response = process(request);
            //3、把响应结果写回客户端
            //此处也要在构造应该DatagramPacket对象
            //构造的时候需要把response中持有的数据内容对应的缓冲区，给设置到DatagramPacket中
            //除了要构造内容之外，还需要传入一个“客户端”对应的地址和端口号
            DatagramPacket responsePacket = new DatagramPacket(response.getBytes(),response.getBytes().length,
                    requestPacket.getSocketAddress());
            socket.send(requestPacket);
            //加入一个日志，更方便用户来理解服务器的运行过程
            String log = "[" + requestPacket.getAddress().toString() + ":" + requestPacket.getPort()
                    + "] req: " + request + "; resp: " + response;
            System.out.println(log);

        }
    }

    private String process(String request) {
        //当前做的是应该回显服务器，客户端法什么，服务器就返回什么
        return request;

    }

}
