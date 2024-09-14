import React from 'react';
import './App.css';

function App() {
  return (
      <div className="container">
        <h1>💫 ArgoCD 오픈소스 컨트리뷰션 스터디</h1>
        <section>
          <h2>📜 Study Info</h2>
          <p>스터디 시작일: 2024.09.02 (월)</p>
          <p>노션 생성일: 2022.08.22 (목)</p>
          <p>스터디 장소: <a href="https://meet.google.com/nkx-ttys-aoz">Google Meet</a></p>
          <p>스터디 시간: 금요일 20:00 ~ 21:30</p>
          <p>스터디 구성원: 정은지, 김규리, 박민기, 장동겸, 이상준</p>
          <p>Slack, Notion으로 소통해요! 💪</p>
        </section>

        <section>
          <h2>🤝 We Promised</h2>
          <ul>
            <li>매주 금요일 20:00 ~ 21:30 정기 세미나</li>
            <li>모임 시작 시 근황 공유하는 시간 갖기</li>
            <li>공부 내용, 새로 알게된 내용, 모르는 내용 공유하기</li>
            <li>매달 각자 세미나 1회 진행하기</li>
            <li>매달 이슈 탐색 및 분석 진행하기(혹은 PR)</li>
            <li>매달 활동 보고서 작성하기</li>
          </ul>
        </section>

        <section>
          <h2>👪 About Us</h2>
          <table>
            <thead>
            <tr>
              <th>이름</th>
              <th>MBTI</th>
              <th>Github</th>
              <th>Velog</th>
              <th>포지션</th>
            </tr>
            </thead>
            <tbody>
            <tr>
              <td>정은지</td>
              <td>INTJ</td>
              <td><a href="https://github.com/bianbbc87">https://github.com/bianbbc87</a></td>
              <td><a href="https://velog.io/@bian87/posts">https://velog.io/@bian87/posts</a></td>
              <td>백엔드</td>
            </tr>
            <tr>
              <td>김규리</td>
              <td>ISFP</td>
              <td><a href="http://github.com/mandar2n">https://github.com/mandar2n</a></td>
              <td>없음</td>
              <td>백엔드</td>
            </tr>
            <tr>
              <td>박민기</td>
              <td>INTJ</td>
              <td><a href="https://github.com/mingi_jeok">https://github.com/mingi_jeok</a></td>
              <td>없음</td>
              <td>백엔드</td>
            </tr>
            <tr>
              <td>장동겸</td>
              <td>ESTP</td>
              <td><a href="https://github.com/dongkyeomjang">https://github.com/dongkyeomjang</a> </td>
              <td><a href="https://velog.io/@dongkyeomjang">https://velog.io/@dongkyeomjang</a></td>
              <td>백엔드</td>
            </tr>
            <tr>
              <td>이상준</td>
              <td>INTP</td>
              <td>없음</td>
              <td>없음</td>
              <td>백엔드</td>
            </tr>
            </tbody>
          </table>
        </section>
      </div>
  );
}

export default App;
