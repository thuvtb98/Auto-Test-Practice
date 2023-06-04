#what is maven local repositories
This is actually a location which is contains all dependencies locally on the machine

Local Maven Repository là một thư mục trong máy tính của các bạn. Nó được tạo ra khi bạn sử dụng Maven trong các dự án của mình, nơi mà sẽ chứa tất cả các thư viện bạn cần để build các dự án. Mặc định thư mục này sẽ nằm trong thư mục của người dùng với tên là “.m2/repository”

Lý do cần đưa về local Maven repository: là khi làm việc với Maven đôi khi thư viện hoặc phiên bản của thư viện bạn cần, Maven không thể tìm thấy nó ở một nơi nào đó trên internet (hay có thể gọi là Remote Maven Repository). Hoặc là thư viện bạn viết ra cần đưa vào Local Maven Repository để những dự án Maven khác có thể dùng được.

#What is maven central repositories
When Local Maven repositories does not find any dependency in local repositories
it start searching in central repositories using following URL: https://repo1.maven.org/maven2/

#What is maven remote repositories
If maven finally can't find dependencies in the central repositories, it will find a remote repository where developer can keep on customize- internal repositories here, or a company has some internal dependencies. 

#Command
run test: mvn clean test

generate allure report: 
allure generate allure-results 
or
allure generate allure-results --clean -- if already have allure-result date before, need overwrite

remove allure report file: allure generate --clean 

remove folder: rm -R {folder name}

mvn clean test -DtestingUrl=https://the-internet.herokuapp.com/



