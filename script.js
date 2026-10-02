let currentPage = 0;

const pages = document.querySelectorAll(".page");


function showPage(index) {

    pages.forEach((page) => {
        page.classList.remove("active");
    });

    pages[index].classList.add("active");

    window.scrollTo({
        top: 0,
        behavior: "smooth"
    });
}


function nextPage() {

    if (currentPage < pages.length - 1) {

        currentPage++;

        showPage(currentPage);

    }
}


function checkCode() {

    const code =
        document.getElementById("secretCode").value;

    const message =
        document.getElementById("codeMessage");


    if (code === "816") {

        message.innerHTML =
            "Unlocked ❤️";

        setTimeout(() => {

            nextPage();

        }, 1000);

    } else {

        message.innerHTML =
            "Not this one... try again ❤️";

    }
}