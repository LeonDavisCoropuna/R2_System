/** @type {import('tailwindcss').Config} */
module.exports = {
  content: [
    "./src/**/*.{js,jsx,ts,tsx}",
  ],
  theme: {
    extend: {
      translate: {
        full: "100%"
      }
    },
    minWidth: {
      "0": "0",
      "24": "6rem",
      "32": "8rem",
      "1/4": "25%",
      "1/2": "50%",
      "3/4": "75%",
      full: "100%"
    }
  },
  variants: {
    rotate: ["responsive", "hover", "group-hover"],
    scale: ["responsive", "hover", "group-hover"]
  },
  plugins: []
}