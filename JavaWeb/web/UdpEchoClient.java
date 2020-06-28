package JavaWeb.web;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class UdpEchoClient {
    DatagramSocket socket = null;
    //客户端必须要知道服务器的ip和端口号
    String serverIP;
    int serverPort;

    public UdpEchoClient(String ip,int port) throws SocketException {
        //当真的发送数据报的时候，就会遇到下面的ip和端口了。
        this.serverIP = ip;
        this.serverPort = port;
        //此时针对客户端给服务器发数据的场景，serverPort就是目的端口，
        // 源端口需要有操作系统自动分配应该空闲的。
        socket = new DatagramSocket();
    }
    public void start() throws IOException {
        Scanner sc = new Scanner(System.in);
        while (true) {
            //1、有用户在命令行输入应该字符串。
            System.out.print(">");
            String request = sc.nextLine();
            if (request.equals("exit")) {
                System.out.println("goodbye");
                break;
            }
            //2、把这个字符串构造成应该请求，发给服务器。
            //客户端send的这个请求对象，内部的数据就和服务器接受到的请求
            //对象内部数据是一致的。
            //这个数据报中的内容就是通过网络通信的方式传输过去的。（各层协议一直封装分用）
            DatagramPacket requestPacket = new DatagramPacket(request.getBytes(),
                    request.getBytes().length,
                    InetAddress.getByName(serverIP),serverPort);
            socket.send(requestPacket);
            //3、读取服务器返回的数据
            DatagramPacket responsePacket = new DatagramPacket(new byte[4096],4096);
            //从此套接字接收数据报包
            socket.receive(requestPacket);
            String response = new String(requestPacket.getData(),
                    0,responsePacket.getLength()).trim();
            //4、把返回值的数据打印在显示器上
            String log = String.format("req:%s;resp:%s",request,response);
            System.out.println(log);

        }
    }

}
