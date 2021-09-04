# 무료 무인 주차 시스템

## 기능 요구 사항

나라에서 운영하는 무료 무인 주차장 시스템을 개발하려고 합니다. 5층짜리 주차장에는 소형차(S), 중형차(M), 대형차(L)를 주차할 수 있습니다. 각 차량의 크기로 구분하는데, 소형차는 1, 중형차는 2, 대형차는
3으로 구분합니다. 소형차는 특권으로 모든 곳에 주차할 수 있습니다. 층마다 각 차량 크기별 주차 공간은 5공간입니다. 주차 공간 위치 명은 `층` - `차량 타입` - `주차 공간 번호`입니다. 차량 번호는
4자리로 각 차량을 구분합니다. 처음 주차장에 들어가면, 차량 번호가 등록되고 주차하고 싶은 위치를 선택하여 주차를 하게 됩니다.

`ex) 주차 위치 명: 2층 중형차 4번째 - 2M4`

## 기능 목록

* [X] 차량은 소형차(S), 중형차(M), 대형차(L)로 구분합니다.

* [X] 차량 크기는 소형차 1, 중형차 2, 대형차는 3으로 지정합니다.

* [X] 차량 크기가 1 ~ 3 이외에 크기는 예외처리를 합니다.

* [X] 차량 번호 4자리로 차량 등록을 합니다.

* [X] 차량 번호는 숫자 4자리가 아니면 예외처리를 합니다.

* [X] 차량 번호가 숫자가 아닐 경우에 예외처리를 합니다.

* [X] 층마다 각 차량별 주차 공간은 각각 5곳으로 지정합니다.

* [X] 주차 건물은 5층입니다. 이외의 층을 입력 받으면 예외처리합니다.

* [X] 주차 위치 명을 통해서, 원하는 주차 위치에 주차할 수 있습니다.

* [X] 주차 위치 명이 틀리면, 예외처리를 합니다.

* [X] 한 차량이 2번 이상 주차할 수 없음으로 이는 예외처리를 합니다.

* [X] 이미 주차된 곳에 주차를 할 수 없음으로 이는 예외처리를 합니다.

* [X] 주차 되어있지 않은 차량을 출차하면 예외처리를 합니다.

* [X] 소형차는 소형차, 중형차, 대형차 주자창에 주차할 수 있습니다.

* [X] 중형차와 대형차는 자신의 구역 외에 추차할 수 없음으로 이는 예외처리를 합니다.

## 클래스 다이어그램

![image](https://user-images.githubusercontent.com/58816862/132098066-b52099b0-ea88-42d8-8889-0153d3706f40.png)
