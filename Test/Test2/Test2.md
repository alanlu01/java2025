# Test2: Chatbot 程式說明

## 功能說明
Test2 實作了一個簡單的 Chatbot，能對使用者的文字輸入做回應。
主要功能：
- 回應問候語 (hi, hello, hey)
- 回答使用者讚美 (good, great, excellent)
- 隨機講笑話
- 根據關鍵字 (sad, upset, stress, tired, happy) 提供勵志建議
- 偵測 "bye" 結束對話

## 題目推測
題目可能要求實作一個基於關鍵字的基本 Chatbot：
1. 提示使用者輸入
2. 對不同關鍵字做對應回應
3. 使用 SecureRandom 隨機挑選笑話
4. 當輸入包含 "bye" 時結束聊天

## 程式完成度
已完成：
- 根據關鍵字回應問候、讚美與建議
- 隨機講笑話功能
- 正確結束對話

待改進：
- random.nextInt(4) 應改為 random.nextInt(jokes.length)
- 移除 TODO 註記並完善隨機笑話選取邏輯

## 執行範例
以下為 Chatbot 範例互動結果（參考 Test-2-results.txt）：
```
Bot: Hi, I'm Chatbot! How can I help you today?
You: hello
Bot: Hello there!
You: tell me a joke
Bot: Why was the math book sad? Because it had too many problems!
... (省略其他互動) ...
Bot: Goodbye!
```