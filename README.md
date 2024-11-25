# PoopchelinGuide

## Table of Contents

[1. Introduce](#introduce)  
[2. What I Did](#what-i-did)  
[3. Project Architecture](#project-architecture)  
[4. Team](#team)  
[5. View](#view)  
[6. Tech Stack](#tech-stack)  

## Introduce
서울의 개방화장실과 쓰레기통의 최신 위치 정보를 실시간으로 제공 및 길찾기 웹 앱 서비스  
화장실이 급한 사람에게 지도앱을 열어서 화장실을 찾을 여유따윈 없다.  
가장 빠르게 서울특별시의 화장실을 찾을 수 있는 간편한 앱!  
<sup>2024. 04. 20. ~ 2024. 04. 30.</sup>   

저희 서비스는 "화장실이 급한 사람에게 지도를 열어서 화장실을 찾을 시간은 없다" 라는 슬로건과 함께 어떤 서비스보다 빠르게 화장실로 가는 최단 거리 보행자 길안내 서비스를 제공합니다. 뿐만 아니라 서울특별시에 있는 화장실에 대한 리뷰와 별점을 통해서 화장실이 청결한지, 온수가 나오는지, 휴지가 있는지 등 간단한 정보를 제공하고 리뷰도 작성할 수 있습니다.

지도에서 나타나는 화장실 마커를 클릭 시 최신 리뷰와 별점, 길찾기 등 기능을 사용할 수 있습니다.
해당 화장실 정보를 간단하게 볼 수 있으며 해당 화장실을 가고자 한다면 길찾기 버튼 클릭 시  현재 위치에서 선택한 화장실을 찾아가는 경로를 지도에 나타나게 해줍니다.

현재 백엔드 서버가 배포되어있지 않아 사용하기 어렵습니다. [View](#view)를 참고하여 주세요.
- [배포된 사이트](https://poopchelinguide.netlify.app/)

## What I Did
- 공공 데이터 API를 이용해 서울의 쓰레기통 및 화장실의 위치정보를 저장
- 쓰레기통, 화장실, 리뷰에 대한 CRUD 구현
- Docker를 이용하여 AWS EC2에 배포
- React.js antd 라이브러리를 활용하여 화장실 팝업 및 플로팅 버튼 구현

## Project Architecture
<img width="712" alt="image" src="https://github.com/user-attachments/assets/39fdf7f6-5c0d-4fb0-9ae4-958c92c54983">


## Team
|[김보성](https://github.com/NangManBo)|[이창의](https://github.com/changuii) |[류세민](https://github.com/ryusemin) | [한동근](https://github.com/l0o0lv)|
| :--:| :--:| :--:| :--:|
| ![](https://avatars.githubusercontent.com/u/124684536?v=4)| ![](https://avatars.githubusercontent.com/u/122252160?v=4) | ![](https://avatars.githubusercontent.com/u/113248843?v=4) | ![](https://avatars.githubusercontent.com/u/128709695?v=4)
| [![My Skills](https://skillicons.dev/icons?i=react)](https://skillicons.dev) | [![My Skills](https://skillicons.dev/icons?i=spring,react)](https://skillicons.dev) | [![My Skills](https://skillicons.dev/icons?i=react)](https://skillicons.dev) | [![My Skills](https://skillicons.dev/icons?i=spring)](https://skillicons.dev)| 

## View

| 메인 지도 페이지 | 화장실 팝업 | 길찾기 | 리뷰 등록 성공 | 리뷰 없는 화장실/쓰레기통 |
|:--:| :--:| :--: | :--: | :--: |
| ![image](https://github.com/user-attachments/assets/1298eaef-2527-496e-87b8-df3bc97844c6)
 |![image](https://github.com/user-attachments/assets/c4cd6f1a-c9d5-41ec-be33-177ac05c4399)
 | ![image](https://github.com/user-attachments/assets/b64b9c7c-347c-4400-a752-eb64f77f21a5)
  | ![image](https://github.com/user-attachments/assets/7cad38b8-e195-4e92-a78e-b4eb856f81fd)
 |![image](https://github.com/user-attachments/assets/031b36f8-2100-4636-9311-7e89b41acbcd)
 |

| 리뷰 페이지 | 리뷰 삭제 | 리뷰 등록 |
|:--:| :--: | :--:|
|![image](https://github.com/user-attachments/assets/f9baf3cb-c2f6-49bd-81ce-a614adf46603)
 | ![image](https://github.com/user-attachments/assets/834992a7-41ef-4725-b6c0-94a0bc3fd869)
 | ![image](https://github.com/user-attachments/assets/a5986805-c93e-4972-bf4b-64b57a1544a8)|

## 📚 Tech Stack
<div align=center >

[개발 문서](https://wool-magpie-f47.notion.site/Poopcheline-Guide-56b40099b67e4ee986b6d36a98d7109c?pvs=4)  
[서울시 공중화장실 위치정보](https://data.seoul.go.kr/dataList/OA-162/S/1/datasetView.do)  
[서울시 가로휴지통 설치정보](https://data.seoul.go.kr/dataList/OA-15069/F/1/datasetView.do)

### 문서관련

[![My Skills](https://skillicons.dev/icons?i=notion)](https://skillicons.dev)  



### 백엔드
[![My Skills](https://skillicons.dev/icons?i=spring,mysql,hibernate)](https://skillicons.dev)  
[![My Skills](https://skillicons.dev/icons?i=aws,docker,ubuntu)](https://skillicons.dev)    

### 프론트엔드
[![My Skills](https://skillicons.dev/icons?i=react,netlify)](https://skillicons.dev)

### 데이터베이스 스키마
![image](https://github.com/user-attachments/assets/8c856696-3894-4e0d-89c5-ef0606585312)


</div>


