### Blog:
https://www.sinasamaki.com/automating-beautiful-screenshots-using-jetpack-compose/

### <img src="images/screenshot1.png" alt="screenshot1" style="zoom:30%;" />

### How to use fastlane to make screenshots?
1. install fastlane: https://docs.fastlane.tools/getting-started/ios/setup/
2. Run ```fastlane android screenshots```
3. screenshots will be auto generated and copied to **fastlane** folders.

### How to support more languages?
Update file **Screengrabfile**, add more languages to **locales**


###  If I run android unitTest manually, where are the screenshot files?
Search "Screengrab" in Logcat.

![screenshot_filepath](images/screenshot_filepath.png)