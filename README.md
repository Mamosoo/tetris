# Source Code Analysis Class Tetris Development

### 한국어는 하단에 위치하고 있습니다(For Korean Users plz go to below)

#### This Repository contains the process that devlopes Project of CBNU SCA class.

This table shows the Priority of this project.

To-do | Priority | Done 
:--- | :---: | :-:
Main-Page | 1st | V 
BGM | 2nd | V 
Effect-Sound | 2nd | V
Rank | 3rd | V 
2Player(Non Network) | 4th | V
BGM ON/OFF | 5th | V
Back ground color change | 6th | V
Guide Line | 7th | V

## Main-Page
<img src = 'https://scontent-icn1-1.xx.fbcdn.net/v/t1.0-9/44611135_1131929570307158_7162483205944115200_n.jpg?_nc_cat=102&_nc_ht=scontent-icn1-1.xx&oh=c98bc9619885b8dd849c953e5afbcf20&oe=5C49CEED' width = '200' height = '400' /> 

#### Reformate the starting point & Add the button to access the rank

## Rank

<img src = 'https://scontent-icn1-1.xx.fbcdn.net/v/t1.0-9/44458175_1131931816973600_5329260717264601088_n.jpg?_nc_cat=111&_nc_ht=scontent-icn1-1.xx&oh=e69e9625d50ce662e2d67eea9cb266cc&oe=5C432B72' width = '200' height = '400' /> 

#### To store score to the text file By NumlineRemoved(at the Board.java). socre -> numline -> txt -> sort -> rank-panel

## 2Player
<img src = 'https://scontent-icn1-1.xx.fbcdn.net/v/t1.0-9/44539064_1131929593640489_9173357533534879744_n.jpg?_nc_cat=102&_nc_ht=scontent-icn1-1.xx&oh=f697e54cd768d83e0425bf5ab053f417&oe=5C83FE94' width = '600' height = '400' /> 

#### Add one more panel, JFrame, Label to making 2Player System

# 전북대학교 소스코드분석 과목 Tetris

#### 해당 레포는 2018년 전북대학교 소프트웨어공학과에서 진행하는 소스크드분석 과목의 과제인 Tetris 코드 분석의 내용을 디벨롭 시키는 과정을 담고 있는 레포입니다.
현재 1차 과제 진행중이며 해당 기능 구현을 위하여 개발 중입니다.

개선사항 | 우선순위 | 완료 
:--- | :---: | :-:
메인페이지 | 1순위 | V 
배경음 | 2순위 | V 
효과음 | 2순위 | V
랭킹 | 3순위 | V 
2인용 | 4순위 | V
배경음 끄기 | 5순위 | V
배경색 변경 | 6순위 | V
가이드라인(블록높이) | 7순위 | V

## 메인페이지
<img src = 'https://scontent-icn1-1.xx.fbcdn.net/v/t1.0-9/44611135_1131929570307158_7162483205944115200_n.jpg?_nc_cat=102&_nc_ht=scontent-icn1-1.xx&oh=c98bc9619885b8dd849c953e5afbcf20&oe=5C49CEED' width = '200' height = '400' /> 

#### 기존 실행시 테트리스로 바로 실행되는 문제점들을 해결하기 위하여 메인페이지를 추가하였고 Rank 기능을 사용하기 위하여 1순위로 추가하였다.

## 랭킹

<img src = 'https://scontent-icn1-1.xx.fbcdn.net/v/t1.0-9/44458175_1131931816973600_5329260717264601088_n.jpg?_nc_cat=111&_nc_ht=scontent-icn1-1.xx&oh=e69e9625d50ce662e2d67eea9cb266cc&oe=5C432B72' width = '200' height = '400' /> 

#### NumlinesRemoved 를 활용하여 랭킹을 텍스트 파일로 저장하였고 sort 기능을 이용하여 해당 부분을 정렬하였다.

## 2인용
<img src = 'https://scontent-icn1-1.xx.fbcdn.net/v/t1.0-9/44539064_1131929593640489_9173357533534879744_n.jpg?_nc_cat=102&_nc_ht=scontent-icn1-1.xx&oh=f697e54cd768d83e0425bf5ab053f417&oe=5C83FE94' width = '600' height = '400' /> 

#### 기존코드의 내용에서 패널, 프레임, 레이블을 추가하고 키입력 부분을 개선하여 2인용 테트리스를 구현 하였다.

## Reference

#### Sound : https://winsound.com/ (Up Arrow Key)
#### Sound : https://www.freesoundeffects.com/free-sounds/gun-10081/ (Space Key)
#### Sound :https://bgmstore.net/view/5bb0d095352039d22706a113/%ED%95%A0%EB%A0%90%EB%A3%A8%EC%95%BC/ (BGM)