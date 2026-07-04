package com.finance;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/health")
public class HealthServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws IOException {

        double income =
            Double.parseDouble(request.getParameter("income"));

        double expense =
            Double.parseDouble(request.getParameter("expense"));

        double savings = income - expense;

        double score = (savings / income) * 100;

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.println("<h1>Financial Health Report</h1>");

        out.println("<h2>Income: ₹" + income + "</h2>");
        out.println("<h2>Expense: ₹" + expense + "</h2>");
        out.println("<h2>Savings: ₹" + savings + "</h2>");
        out.println("<h2>Health Score: "
                + String.format("%.2f", score)
                + "%</h2>");

        if (score >= 50) {
            out.println("<h2>Status: Excellent ✅</h2>");
        } else if (score >= 30) {
            out.println("<h2>Status: Good 👍</h2>");
        } else {
            out.println("<h2>Status: Needs Improvement ⚠️</h2>");
        }
    }
}