# 🏋️‍♂️ 헬스 추천 플랫폼 (Health Recommendation Platform)

<div align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" />
  <img src="https://img.shields.io/badge/Spring%20Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white" />
  <img src="https://img.shields.io/badge/Ubuntu-E95420?style=for-the-badge&logo=ubuntu&logoColor=white" />
  <img src="https://img.shields.io/badge/HTML5-E34F26?style=for-the-badge&logo=html5&logoColor=white" />
  <br>
  <h3>"당신의 운동을 책임집니다!"</h3>
  <p>초보자를 위한 AI 기반 맞춤형 운동 루틴 & 식단 추천 웹 서비스</p>
</div>

<br>

## 📝 Project Overview (프로젝트 소개)
[cite_start]**헬스 추천 플랫폼**은 운동을 처음 시작하는 초보자들이 겪는 어려움(루틴 구성, 비용 부담)을 해결하기 위해 개발된 **AI 기반 웹 서비스**입니다. [cite: 32, 36]

[cite_start]사용자의 신체 정보와 목표(벌크업, 다이어트)를 분석하여 **맞춤형 운동 루틴과 식단을 제공**하며, **AI 트레이너와의 실시간 상담**을 통해 언제 어디서든 전문적인 조언을 얻을 수 있습니다. [cite: 38, 41]

### 🎯 개발 목표
* [cite_start]**초보자 맞춤:** 복잡한 운동 지식 없이도 쉽게 따라 할 수 있는 루틴 제공 [cite: 35]
* [cite_start]**비용 절감:** 고가의 PT 없이도 체계적인 관리 가능 [cite: 34]
* [cite_start]**AI 결합:** 데이터 기반의 객관적인 운동/식단 추천 및 실시간 Q&A [cite: 37]

---

## ✨ Key Features (주요 기능)

### 1. 📋 맞춤형 운동/식단 추천 (`/recommend`)
* [cite_start]**설문 시스템:** 성별, 운동 경력(초/중/상급), 주당 운동 횟수, 목표(체지방 감소/근력 유지 등)를 입력받습니다. [cite: 70, 89]
* [cite_start]**루틴 생성:** 입력된 데이터를 기반으로 **벌크업** 또는 **다이어트** 프로그램을 자동으로 생성하여 제공합니다. [cite: 68, 69]
* [cite_start]**상세 가이드:** 운동 동작을 쉽게 따라 할 수 있도록 **GIF 애니메이션**과 상세 설명을 함께 제공합니다. [cite: 61, 84]

### 2. 📅 운동 기록 관리 (`/workout_log`)
* [cite_start]**캘린더 뷰:** 날짜별로 수행한 운동 루틴을 기록하고 관리합니다. [cite: 92]
* [cite_start]**메모 기능:** 그날의 컨디션이나 특이사항을 메모로 남길 수 있습니다. [cite: 106]
* [cite_start]**기록 관리:** 저장된 운동 기록을 조회하고 삭제하는 기능을 제공합니다. [cite: 55]

### 3. 🤖 AI 트레이너 (`Chatbot`)
* [cite_start]**실시간 상담:** 챗봇 API를 연동하여 운동 방법에 대한 궁금증을 실시간으로 해결합니다. [cite: 57, 77]
* [cite_start]**개인화 조언:** 사용자의 질문에 맞춰 맞춤형 운동 팁과 동기 부여 메시지를 제공합니다. [cite: 59, 80]

### 4. 🧘 스트레칭 & 부위별 루틴
* [cite_start]**API 연동:** 외부 API를 활용하여 다양한 스트레칭 동작을 추천합니다. [cite: 64, 82]
* [cite_start]**부위별 운동:** 가슴, 등, 어깨, 하체 등 원하는 부위를 선택하여 집중적으로 훈련할 수 있는 루틴을 제공합니다. [cite: 60, 83]

---

## 🛠 Tech Stack & Environment

| 분류 | 기술 스택 | 상세 내용 |
| :--- | :--- | :--- |
| **OS / Server** | ![Ubuntu](https://img.shields.io/badge/Ubuntu_22.04-E95420?logo=ubuntu) | [cite_start]안정적인 서버 환경 구축 [cite: 9] |
| **Backend** | ![Java](https://img.shields.io/badge/Java-ED8B00?logo=openjdk) ![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?logo=spring-boot) | [cite_start]REST API 설계, 비즈니스 로직 구현 [cite: 10, 44] |
| **Frontend** | ![HTML5](https://img.shields.io/badge/HTML5-E34F26?logo=html5) ![CSS3](https://img.shields.io/badge/CSS3-1572B6?logo=css3) ![JS](https://img.shields.io/badge/JavaScript-F7DF1E?logo=javascript) | [cite_start]반응형 웹 디자인, 동적 UI 구현 [cite: 11, 46, 47] |

---

## 💻 Screen Configuration (화면 구성)

| 메인 페이지 | 맞춤형 설문 (다이어트/벌크업) |
| :---: | :---: |
| <img src="[메인페이지 이미지 경로]" width="400" /> | <img src="[설문페이지 이미지 경로]" width="400" /> |
| 직관적인 메뉴 구성 및 프로그램 선택 | 사용자 목표 설정을 위한 단계별 설문 |

| 운동 기록 (Calendar) | AI 트레이너 & 결과 페이지 |
| :---: | :---: |
| <img src="[운동기록 이미지 경로]" width="400" /> | <img src="[AI트레이너 이미지 경로]" width="400" /> |
| 날짜별 루틴 저장 및 관리 | 실시간 챗봇 상담 및 추천 결과 |

> *이미지 파일은 `src/main/resources/static/img` 또는 별도 `assets` 폴더에 위치시켜주세요.*

---

## 📂 Project Structure

```bash
com.example.demo
├── 🎮 controller
│   ├── MainController.java      # 메인 페이지 및 네비게이션
│   ├── RecommendController.java # 운동/식단 추천 로직 처리
│   └── LogController.java       # 운동 기록 처리
├── 📦 domain
│   ├── UserInfo.java            # 사용자 설문 정보 객체
│   └── WorkoutLog.java          # 운동 기록 객체
├── ⚙️ service
│   ├── AiTrainerService.java    # 챗봇 API 연동 로직
│   └── WorkoutService.java      # 추천 알고리즘 로직
└── 📄 templates (Frontend)
    [cite_start]├── index.html               # 메인 페이지 [cite: 98]
    ├── bulk.html                # 벌크업 프로그램 페이지
    [cite_start]├── diet.html                # 다이어트 프로그램 페이지 [cite: 68]
    [cite_start]├── workout_log.html         # 운동 기록 페이지 [cite: 72]
    └── recommend.html           # 추천 결과 페이지
