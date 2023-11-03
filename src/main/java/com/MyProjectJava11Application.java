package com;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MyProjectJava11Application extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // コンテンツタイプをHTMLに設定
        response.setContentType("text/html");
        // HTMLコンテンツを書くためのPrintWriterオブジェクトを取得
        PrintWriter out = response.getWriter();

        // HTMLコンテンツを出力
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("    <title>MyProject</title>");
        out.println("    <link rel=\"icon\" type=\"image/x-icon\" href=\"img/haku.png\" />");
        out.println("    <link rel=\"stylesheet\" href=\"css/styles.css\">");
        out.println("</head>");
        out.println("<body>");
        out.println("    <div class=\"app-container\">");
        out.println("        <!-- ここにサーバー側の動的コンテンツを追加 -->");
        out.println("    </div>");
        out.println("    <script src=\"js/script.js\"></script>");
        // 他のHTMLコンテンツを追加...
        out.println("</body>");
        out.println("</html>");
    }
}
