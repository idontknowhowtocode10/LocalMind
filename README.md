# LocalMind — Free, Private, On-Device AI Chatbot (No API Key Required)

> Run large language models **100% in your browser**. No server. No cloud. No data leaks. Powered by WebGPU + WebAssembly via Transformers.js.

[![Live Demo](https://img.shields.io/badge/Live%20Demo-GitHub%20Pages-7c3aed?style=flat-square)](https://YOUR_USERNAME.github.io/localmind)
[![License: MIT](https://img.shields.io/badge/License-MIT-06b6d4?style=flat-square)](LICENSE)
[![Transformers.js](https://img.shields.io/badge/Transformers.js-v3-yellow?style=flat-square)](https://huggingface.co/docs/transformers.js)
[![Zero Dependencies](https://img.shields.io/badge/Build%20Step-None-success?style=flat-square)]()

---

## What Is LocalMind?

**LocalMind** is an open-source, **client-side AI chat interface** that runs LLMs directly in your browser using [Transformers.js v3](https://github.com/xenova/transformers.js) and WebGPU acceleration. It is a **single `index.html` file** — no backend, no Node.js, no Docker, no paid API.

Models download once from Hugging Face and are cached locally via the browser's Cache API. All inference happens on your CPU or GPU — your conversations never leave your machine.

---

## ✨ Features

| Feature | Detail |
|---|---|
| 🔒 **100% Private** | Zero telemetry. All data stays in your browser |
| ⚡ **WebGPU Accelerated** | Falls back to WASM automatically |
| 💬 **Multi-chat** | Persistent chat history via IndexedDB (LocalForage) |
| 🔄 **4 Model Choices** | From 135M to 1B parameters |
| 📱 **Mobile Responsive** | Works on phones, tablets, desktops |
| 🚫 **No API Key** | Completely free to run |
| 📦 **Single File** | The entire app is one `index.html` |
| 🌊 **Streaming Output** | Real-time token-by-token generation |
| 📊 **Live Engine Log** | Tokens/sec, download progress, model status |

---

## 🧠 Supported Models

All models are sourced from Hugging Face and cached locally after the first download.

| Model | Size | Best For |
|---|---|---|
| SmolLM2 135M Instruct | ~270MB | Fastest responses, low RAM devices |
| SmolLM2 360M Instruct | ~720MB | Balanced speed and quality |
| Qwen 2.5 0.5B Instruct | ~1GB | Smart responses, still lightweight |
| Llama 3.2 1B Instruct (Q4) | ~800MB | Most capable, richest reasoning |

---

## 🚀 Deploy in 60 Seconds (GitHub Pages)

```bash
# 1. Fork or clone this repo
git clone https://github.com/YOUR_USERNAME/localmind.git
cd localmind

# 2. That's it — no npm install, no build step
# 3. Push to GitHub and enable GitHub Pages (Settings → Pages → main branch / root)
```

Your live URL: `https://idontknowhowtocode10.github.io/localmind`

---

## 🖥️ Run Locally

```bash
# Any static file server works:
npx serve .
# or
python3 -m http.server 8080
```

Open `http://localhost:8080` — **do not open `index.html` directly** as a `file://` URL (CORS blocks model fetching).

---

## 🔧 How It Works

```
User types message
      ↓
Messages array formatted as chat template (per-model)
      ↓
Transformers.js pipeline runs inference (WebGPU → WASM fallback)
      ↓
TextStreamer pushes tokens to UI in real time
      ↓
Full conversation saved to IndexedDB via LocalForage
```

**Tech stack:** Vanilla JS (ES Modules) · Transformers.js v3 · LocalForage · Zero build tooling

---

## 🌐 Browser Compatibility

| Browser | WebGPU | WASM Fallback |
|---|---|---|
| Chrome 113+ | ✅ | ✅ |
| Edge 113+ | ✅ | ✅ |
| Firefox | ❌ | ✅ |
| Safari 18+ | ✅ (partial) | ✅ |

> **Tip:** For best performance, use Chrome or Edge with a dedicated GPU.

---

## 🔍 FAQ

**Does this work offline?**
After the first model download, yes — the model is cached by the browser and works fully offline.

**Where are my chats stored?**
In your browser's IndexedDB. They never leave your device.

**Can I add my own models?**
Yes. Any Hugging Face model compatible with Transformers.js `text-generation` pipeline can be added to the dropdown in `index.html`.

**Why is the first load slow?**
The model weights are being downloaded (270MB–1GB depending on model). This is a one-time download.

---

## 📁 Project Structure

```
localmind/
└── index.html   ← entire application (HTML + CSS + JS)
└── README.md
```

---

## 🤝 Contributing

PRs welcome. Ideas for contribution:
- Additional model support
- Markdown rendering in chat bubbles
- System prompt / persona editor
- PWA / offline manifest
- Export chat as JSON or PDF

---

## 📄 License

MIT © 2025 — free to use, fork, and deploy.

---

## 🔗 Related Projects & Keywords

*local LLM browser · on-device AI chatbot · WebGPU language model · run LLM without API · private AI assistant · Transformers.js chatbot · offline AI chat · SmolLM2 browser · Llama browser inference · free AI chat no login · self-hosted AI single file · GitHub Pages AI demo*
