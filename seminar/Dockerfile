# Node.js 기반 이미지를 사용하여 애플리케이션을 빌드
FROM node:14

# 작업 디렉토리 생성
WORKDIR /app

# package.json과 package-lock.json을 복사
COPY package*.json ./

# 의존성 설치
RUN npm install

# 소스 코드 전체를 복사
COPY . .

# 3000번 포트 사용 (React 개발 서버의 기본 포트)
EXPOSE 3000

# 개발 서버 시작
CMD ["npm", "start"]
