<?php
// 모든 출처에서의 요청을 허용합니다.
header("Access-Control-Allow-Origin: *");
// 허용할 HTTP 메서드를 지정합니다.
header("Access-Control-Allow-Methods: GET, POST, OPTIONS");
// 허용할 헤더를 지정합니다.
header("Access-Control-Allow-Headers: Content-Type, Authorization");
// 1. 브라우저에게 우리가 보내는 데이터가 XML 형식임을 알립니다.
header('Content-Type: application/xml; charset=utf-8');

// 2. AJAX 요청에 반환할 샘플 데이터 (JSON 예제와 동일)
$users_data = [
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

// 3. SimpleXMLElement를 사용하여 XML 구조 생성
// <users>가 최상위(root) 엘리먼트가 됩니다.
$xml = new SimpleXMLElement('<?xml version="1.0" encoding="UTF-8"?><users></users>');

// 4. 데이터 배열을 순회하면서 XML 엘리먼트를 추가합니다.
foreach ($users_data as $user_item) {
    // <users> 엘리먼트 아래에 <user> 엘리먼트를 추가합니다.
    $user_node = $xml->addChild('user');
    
    // <user> 엘리먼트 아래에 데이터 필드를 엘리먼트로 추가합니다.
    $user_node->addChild('id', $user_item['id']);
    $user_node->addChild('name', $user_item['name']);
    $user_node->addChild('email', $user_item['email']);
    $user_node->addChild('job', $user_item['job']);
}

// 5. 생성된 XML 객체를 문자열로 출력합니다.
echo $xml->asXML();

?>