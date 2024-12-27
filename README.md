<div align="center">
  <img src="https://github.com/user-attachments/assets/82e205d5-59d2-462f-a36c-ebbdbd3fef6f" alt="시간의 발자취" height="500"/>
</div>


# 🕰️ 시간의 발자취

사용자가 1800년대부터 2020년대까지 주요 역사를 탐험하며 사건의 상세 정보를 확인할 수 있는 앱.

- **개발 기간**: 2024년 12월

---

## 📝 계기

역사에 관심이 많아 이를 기반으로 의미 있는 앱을 만들고 싶었습니다.

처음에는 역사 퀴즈 앱과 정보 앱 사이에서 고민했지만, 최종적으로 **다양한 연대별 역사적 사건을 탐험할 수 있는 정보 앱**을 만들기로 결정했습니다.

사용자에게 연대별 사건을 쉽게 탐색하고 상세히 알아볼 수 있는 기회를 제공하고 싶었습니다.

또한, 개인적으로 Kotlin과 Compose가 아직 익숙하지 않아, 프로젝트를 통해 익숙해지고 싶은 목표도 있었습니다.

---

## 🌟 핵심 기능

- **연대 선택 화면**
  - 1800년대부터 2020년대까지의 연대별 버튼 제공.
  - 연대 선택 시 해당 연도의 사건으로 이동.
  - 직관적인 카드 UI와 반응형 디자인.
- **사건 목록 화면**
  - 선택된 연대의 사건 목록 제공.
  - 사건 선택 시 상세 설명 화면으로 이동.
- **사건 상세 화면**
  - 선택된 사건의 상세 설명 제공.
  - 사용자가 사건의 배경과 중요성을 이해할 수 있도록 상세 정보 표시.
- **네비게이션**
  - 모든 화면에서 뒤로 가기 및 홈으로 이동 가능.
  - `Screen` sealed 클래스를 활용한 경로 관리.

---

## 🛠 기술 스택 (Tech Stack)

- `Jetpack Compose`
- `Material 3`
- `Room`
- `MVVM`
- `Coroutine`
- `Navigation Compose`

---

## ⁉️ 기술적 도전 및 해결

1. 위키피디아 API를 통해 역사 사건 데이터를 가져오려고 했지만, 사건 부분을 끝까지 해결하지 못해 API 사용을 포기했습니다.
2. 화면마다 디자인 일관성을 유지하기 위해 Material 3을 활용해 앱 전체에 UI를 적용했습니다.

---

## ‼️ 배운 점 및 아쉬운 점

- MVVM, Retrofit, Room, Navigation 등 다양한 기술을 활용하려 했지만 구현 과정에서 어려움을 느꼈습니다.
- 각 기술의 올바른 사용법에 대한 확신이 부족했고, 디자인 완성도에서도 아쉬움이 남습니다.
- 하지만 기술들을 직접 프로젝트에 활용하려고 노력한 점에서 도움이 되었습니다.
- 추후에는 더 다양한 역사 데이터를 제공하고, 단순한 정보 앱이 아닌, 역사를 쉽게 공부할 수 있는 앱을 만들고 싶습니다.
