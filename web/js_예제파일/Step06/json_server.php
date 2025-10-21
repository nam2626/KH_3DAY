<?php
// 모든 출처에서의 요청을 허용합니다.
header("Access-Control-Allow-Origin: *");
// 허용할 HTTP 메서드를 지정합니다.
header("Access-Control-Allow-Methods: GET, POST, OPTIONS");
// 허용할 헤더를 지정합니다.
header("Access-Control-Allow-Headers: Content-Type, Authorization");
// 1. 브라우저에게 우리가 보내는 데이터가 JSON 형식임을 알립니다.
// 이 헤더 설정은 매우 중요합니다.
header('Content-Type: application/json; charset=utf-8');

// 2. AJAX 요청에 반환할 샘플 데이터 (PHP 연관 배열)
$users = [
    [
        "id" => 1,
        "name" => "홍길동",
        "email" => "gildong@example.com",
        "job" => "의적"
    ],
    [
        "id" => 2,
        "name" => "이순신",
        "email" => "sunshin@example.com",
        "job" => "장군"
    ],
    [
        "id" => 3,
        "name" => "세종대왕",
        "email" => "sejong@example.com",
        "job" => "왕"
    ]
];

// 3. PHP 배열을 JSON 문자열로 변환하여 출력합니다.
// JSON_UNESCAPED_UNICODE 옵션은 한글이 유니코드(예: \uD64D)로 이스케이프되지 않고 그대로 보이게 합니다.
echo json_encode($users, JSON_UNESCAPED_UNICODE | JSON_PRETTY_PRINT);

?>