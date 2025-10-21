 function showCalendar() {
            const yearInput = document.querySelector("#year");
            const monthInput = document.querySelector("#month");
            const year = yearInput.value;
            const month = monthInput.value;

            if (!year || !month) {
                alert("년도와 월을 모두 입력해주세요.");
                return;
            }

            const today = new Date();
            today.setHours(0, 0, 0, 0); // 시간 정보를 제거하여 날짜만 비교하도록 설정

            let firstDay = new Date(year, month - 1, 1);
            let lastDay = new Date(year, month, 0);
            
            let startDate = new Date(firstDay);
            startDate.setDate(startDate.getDate() - startDate.getDay());

            let endDate = new Date(lastDay);
            endDate.setDate(endDate.getDate() + (6 - endDate.getDay()));

            let tag = `<h2>${year}년 ${month}월</h2>`;
            tag += '<table><tr><th>일</th><th>월</th><th>화</th><th>수</th><th>목</th><th>금</th><th>토</th></tr>';

            while (startDate.getTime() <= endDate.getTime()) {
                const isCurrentMonth = startDate.getMonth() == month - 1;
                const isToday = startDate.getTime() === today.getTime();
                
                let classes = [];
                if (!isCurrentMonth) {
                    classes.push('other-month');
                }
                if (isToday) {
                    classes.push('today');
                }
                const tdClass = classes.length > 0 ? ` class='${classes.join(' ')}'` : '';

                switch (startDate.getDay()) {
                    case 0:
                        tag += `<tr><td${tdClass}>${startDate.getDate()}</td>`;
                        break;
                    case 6:
                        tag += `<td${tdClass}>${startDate.getDate()}</td></tr>`;
                        break;
                    default:
                        tag += `<td${tdClass}>${startDate.getDate()}</td>`;
                }
                startDate.setDate(startDate.getDate() + 1);
            }
            tag += '</table>';

            document.querySelector("#calendar").innerHTML = tag;
        }