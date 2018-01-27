package burp;

import java.io.PrintWriter;

public class BurpExtender implements IBurpExtender {

    public void registerExtenderCallbacks(IBurpExtenderCallbacks iBurpExtenderCallbacks) {
        // 拡張プラグインの命名
        iBurpExtenderCallbacks.setExtensionName("Hello, Burp Suite");

        // メッセージを表示
        PrintWriter stdout = new PrintWriter(iBurpExtenderCallbacks.getStdout(), true);
        stdout.println("INFO : Hello, Burp Suite");

        // エラーメッセージを表示
        PrintWriter stderr = new PrintWriter(iBurpExtenderCallbacks.getStderr(), true);
        stderr.println("ERROR : Hello, Burp Suite");

        // アラートタブにメッセージを表示
        iBurpExtenderCallbacks.issueAlert("Burp Suite Alerts");

        // 例外発生
        throw new RuntimeException("Burp Suite exceptions");
    }
}
