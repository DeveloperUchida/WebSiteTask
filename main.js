function updateClock() {
    var now = new Date();
    var hours = now.getHours();
    var minutes = now.getMinutes();
    var seconds = now.getSeconds();

    // ゼロパディングを行う
    hours = hours.toString().padStart(2, '0');
    minutes = minutes.toString().padStart(2, '0');
    seconds = seconds.toString().padStart(2, '0');

    var timeString = hours + ':' + minutes + ':' + seconds;
    document.getElementById('time').textContent = timeString;
}

// 1秒ごとに時計を更新する
setInterval(updateClock, 1000);