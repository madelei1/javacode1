package JavaWeb.web;

        import java.io.IOException;
        import java.net.SocketException;
        import java.util.HashMap;

public class UdpDictServer extends UdpEchoServer {
    private HashMap<String,String> dict = new HashMap<>();


    public UdpDictServer(int port) throws SocketException {
        super(port);
        dict.put("hello", "你好");
        dict.put("cat", "小猫");
        dict.put("dog", "小狗");
        dict.put("fuck", "卧槽");
    }
    public String process(String request) {
        return dict.getOrDefault(request,"超出范围");
    }

    public static void main(String[] args) throws IOException {
        UdpDictServer server = new UdpDictServer(9090);
        server.start();
    }
}
