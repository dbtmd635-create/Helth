package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.List;

@Controller
public class MainController {

    // 메인 페이지
    @GetMapping("/")
    public String index() {
        return "index"; // templates/index.html
    }



    // 벌크업 페이지 이동
    @GetMapping("/bulk_select")
    public String bulkSelect() {
        return "bulk"; // templates/bulk.html
    }
    // 운동 기록 페이지 이동
    @GetMapping("/workout_log")
    public String workoutLog() {
        return "workout_log"; // templates/workout_log.html
    }

    // 벌크업 결과 처리
    @PostMapping("/bulk_result")
    public String bulkResult(@RequestParam(required = false) List<String> exercise,
                             @RequestParam String period,
                             @RequestParam String level,
                             Model model) {

        System.out.println("선택한 운동: " + exercise);
        System.out.println("운동 기간: " + period);
        System.out.println("난이도: " + level);

        model.addAttribute("exercises", exercise);
        model.addAttribute("period", period);
        model.addAttribute("level", level);

        return "bulk_result"; // templates/bulk_result.html
    }

    // 다이어트 페이지 이동
    @GetMapping("/diet_select")
    public String dietSelect() {
        return "diet"; // templates/diet.html
    }

    // 다이어트 결과 처리
    @PostMapping("/diet_result")
    public String dietResult(@RequestParam(required = false) List<String> exercise,
                             @RequestParam String period,
                             @RequestParam String goal,
                             Model model) {

        System.out.println("선택한 운동: " + exercise);
        System.out.println("운동 기간: " + period);
        System.out.println("다이어트 목표: " + goal);

        model.addAttribute("exercises", exercise);
        model.addAttribute("period", period);
        model.addAttribute("goal", goal);

        return "diet_result"; // templates/diet_result.html
    }

    // ⭐ Papago 번역 API (Rest 처럼 사용 → @ResponseBody 붙이면 됨)
    @PostMapping("/api/translate")
    @ResponseBody
    public String translate(@RequestParam String text) {
        String clientId = "너의-Client-ID"; // 네이버 PAPAGO Client ID
        String clientSecret = "너의-Client-Secret"; // 네이버 PAPAGO Client Secret

        try {
            URL url = new URL("https://openapi.naver.com/v1/papago/n2mt");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("POST");
            con.setRequestProperty("X-Naver-Client-Id", clientId);
            con.setRequestProperty("X-Naver-Client-Secret", clientSecret);

            String postParams = "source=en&target=ko&text=" + URLEncoder.encode(text, "UTF-8");

            con.setDoOutput(true);
            DataOutputStream wr = new DataOutputStream(con.getOutputStream());
            wr.writeBytes(postParams);
            wr.flush();
            wr.close();

            int responseCode = con.getResponseCode();
            BufferedReader br;
            if (responseCode == 200) {
                br = new BufferedReader(new InputStreamReader(con.getInputStream()));
            } else {
                br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
            }
            String inputLine;
            StringBuffer response = new StringBuffer();
            while ((inputLine = br.readLine()) != null) {
                response.append(inputLine);
            }
            br.close();

            // JSON 파싱 없이 → 그냥 substring 으로 간단히 추출 (org.json 없어도 가능)
            String result = response.toString();
            int start = result.indexOf("\"translatedText\":\"") + 18;
            int end = result.indexOf("\"", start);
            if (start > 17 && end > start) {
                return result.substring(start, end);
            } else {
                return "번역 오류(파싱)";
            }

        } catch (Exception e) {
            e.printStackTrace();
            return "번역 오류(예외)";
        }
    }
}
